
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/geometry/mojo/geometry.mojom
//

package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class RectF extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public float x;
    public float y;
    public float width;
    public float height;

    private RectF(int version) {
        super(STRUCT_SIZE, version);
    }

    public RectF() {
        this(0);
    }

    public static RectF deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static RectF deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static RectF decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        RectF result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new RectF(elementsOrVersion);
                {
                    
                result.x = decoder0.readFloat(8);
                }
                {
                    
                result.y = decoder0.readFloat(12);
                }
                {
                    
                result.width = decoder0.readFloat(16);
                }
                {
                    
                result.height = decoder0.readFloat(20);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.x, 8);
        
        encoder0.encode(this.y, 12);
        
        encoder0.encode(this.width, 16);
        
        encoder0.encode(this.height, 20);
    }
}