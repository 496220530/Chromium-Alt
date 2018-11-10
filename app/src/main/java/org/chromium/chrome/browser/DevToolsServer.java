// Copyright 2012 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser;

import android.content.pm.PackageManager;
import android.support.annotation.IntDef;

import org.chromium.base.ApiCompatibilityUtils;
import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.CalledByNative;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Controller for Remote Web Debugging (Developer Tools).
 */
public class DevToolsServer {
    private static final String DEBUG_PERMISSION_SIFFIX = ".permission.DEBUG";

    private long mNativeDevToolsServer;

    // Defines what processes may access to the socket.
    @IntDef({Security.DEFAULT, Security.ALLOW_DEBUG_PERMISSION})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Security {
        // Use content::CanUserConnectToDevTools to authorize access to the socket.
        int DEFAULT = 0;
        // In addition to default authorization allows access to an app with android permission
        // named chromeAppPackageName + DEBUG_PERMISSION_SIFFIX.
        int ALLOW_DEBUG_PERMISSION = 1;
    }

    public DevToolsServer(String socketNamePrefix) {
        mNativeDevToolsServer = nativeInitRemoteDebugging(socketNamePrefix);
    }

    public void destroy() {
        nativeDestroyRemoteDebugging(mNativeDevToolsServer);
        mNativeDevToolsServer = 0;
    }

    public boolean isRemoteDebuggingEnabled() {
        return nativeIsRemoteDebuggingEnabled(mNativeDevToolsServer);
    }

    public void setRemoteDebuggingEnabled(boolean enabled, @Security int security) {
        boolean allowDebugPermission = security == Security.ALLOW_DEBUG_PERMISSION;
        nativeSetRemoteDebuggingEnabled(mNativeDevToolsServer, enabled, allowDebugPermission);
    }

    public void setRemoteDebuggingEnabled(boolean enabled) {
        setRemoteDebuggingEnabled(enabled, Security.DEFAULT);
    }

    private native long nativeInitRemoteDebugging(String socketNamePrefix);
    private native void nativeDestroyRemoteDebugging(long devToolsServer);
    private native boolean nativeIsRemoteDebuggingEnabled(long devToolsServer);
    private native void nativeSetRemoteDebuggingEnabled(
            long devToolsServer, boolean enabled, boolean allowDebugPermission);

    @CalledByNative
    private static boolean checkDebugPermission(int pid, int uid) {
        String debugPermissionName =
                ContextUtils.getApplicationContext().getPackageName() + DEBUG_PERMISSION_SIFFIX;
        return ApiCompatibilityUtils.checkPermission(
                       ContextUtils.getApplicationContext(), debugPermissionName, pid, uid)
                == PackageManager.PERMISSION_GRANTED;
    }
}
