
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/contextual_search/content/common/contextual_search_js_api_service.mojom
//

package org.chromium.contextual_search.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface ContextualSearchJsApiService extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ContextualSearchJsApiService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ContextualSearchJsApiService, ContextualSearchJsApiService.Proxy> MANAGER = ContextualSearchJsApiService_Internal.MANAGER;


    void shouldEnableJsApi(
org.chromium.url.mojom.Url url, 
ShouldEnableJsApiResponse callback);

    interface ShouldEnableJsApiResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }



    void handleSetCaption(
String message, boolean doesAnswer);



    void handleChangeOverlayPosition(
int desiredPosition);


}
