
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/indexeddb/indexeddb.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface IdbDatabaseCallbacks extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends IdbDatabaseCallbacks, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<IdbDatabaseCallbacks, IdbDatabaseCallbacks.Proxy> MANAGER = IdbDatabaseCallbacks_Internal.MANAGER;


    void forcedClose(
);



    void versionChange(
long oldVersion, long newVersion);



    void abort(
long transactionId, int code, org.chromium.mojo_base.mojom.String16 message);



    void complete(
long transactionId);



    void changes(
IdbObserverChanges changes);


}
