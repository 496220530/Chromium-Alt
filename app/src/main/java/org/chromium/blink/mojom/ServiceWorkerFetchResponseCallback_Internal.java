
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_fetch_response_callback.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class ServiceWorkerFetchResponseCallback_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ServiceWorkerFetchResponseCallback, ServiceWorkerFetchResponseCallback.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ServiceWorkerFetchResponseCallback, ServiceWorkerFetchResponseCallback.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.ServiceWorkerFetchResponseCallback";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, ServiceWorkerFetchResponseCallback impl) {
            return new Stub(core, impl);
        }

        @Override
        public ServiceWorkerFetchResponseCallback[] buildArray(int size) {
          return new ServiceWorkerFetchResponseCallback[size];
        }
    };


    private static final int ON_RESPONSE_ORDINAL = 0;

    private static final int ON_RESPONSE_STREAM_ORDINAL = 1;

    private static final int ON_FALLBACK_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ServiceWorkerFetchResponseCallback.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onResponse(
FetchApiResponse response, org.chromium.mojo_base.mojom.Time dispatchEventTime) {

            ServiceWorkerFetchResponseCallbackOnResponseParams _message = new ServiceWorkerFetchResponseCallbackOnResponseParams();

            _message.response = response;

            _message.dispatchEventTime = dispatchEventTime;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RESPONSE_ORDINAL)));

        }


        @Override
        public void onResponseStream(
FetchApiResponse response, ServiceWorkerStreamHandle bodyAsStream, org.chromium.mojo_base.mojom.Time dispatchEventTime) {

            ServiceWorkerFetchResponseCallbackOnResponseStreamParams _message = new ServiceWorkerFetchResponseCallbackOnResponseStreamParams();

            _message.response = response;

            _message.bodyAsStream = bodyAsStream;

            _message.dispatchEventTime = dispatchEventTime;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RESPONSE_STREAM_ORDINAL)));

        }


        @Override
        public void onFallback(
org.chromium.mojo_base.mojom.Time dispatchEventTime) {

            ServiceWorkerFetchResponseCallbackOnFallbackParams _message = new ServiceWorkerFetchResponseCallbackOnFallbackParams();

            _message.dispatchEventTime = dispatchEventTime;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_FALLBACK_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ServiceWorkerFetchResponseCallback> {

        Stub(org.chromium.mojo.system.Core core, ServiceWorkerFetchResponseCallback impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                ServiceWorkerFetchResponseCallback_Internal.MANAGER, messageWithHeader);





                    case ON_RESPONSE_ORDINAL: {

                        ServiceWorkerFetchResponseCallbackOnResponseParams data =
                                ServiceWorkerFetchResponseCallbackOnResponseParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onResponse(data.response, data.dispatchEventTime);
                        return true;
                    }





                    case ON_RESPONSE_STREAM_ORDINAL: {

                        ServiceWorkerFetchResponseCallbackOnResponseStreamParams data =
                                ServiceWorkerFetchResponseCallbackOnResponseStreamParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onResponseStream(data.response, data.bodyAsStream, data.dispatchEventTime);
                        return true;
                    }





                    case ON_FALLBACK_ORDINAL: {

                        ServiceWorkerFetchResponseCallbackOnFallbackParams data =
                                ServiceWorkerFetchResponseCallbackOnFallbackParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onFallback(data.dispatchEventTime);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), ServiceWorkerFetchResponseCallback_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ServiceWorkerFetchResponseCallbackOnResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public FetchApiResponse response;
        public org.chromium.mojo_base.mojom.Time dispatchEventTime;

        private ServiceWorkerFetchResponseCallbackOnResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ServiceWorkerFetchResponseCallbackOnResponseParams() {
            this(0);
        }

        public static ServiceWorkerFetchResponseCallbackOnResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerFetchResponseCallbackOnResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ServiceWorkerFetchResponseCallbackOnResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerFetchResponseCallbackOnResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ServiceWorkerFetchResponseCallbackOnResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.response = FetchApiResponse.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.dispatchEventTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
            
            encoder0.encode(this.response, 8, false);
            
            encoder0.encode(this.dispatchEventTime, 16, false);
        }
    }



    
    static final class ServiceWorkerFetchResponseCallbackOnResponseStreamParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public FetchApiResponse response;
        public ServiceWorkerStreamHandle bodyAsStream;
        public org.chromium.mojo_base.mojom.Time dispatchEventTime;

        private ServiceWorkerFetchResponseCallbackOnResponseStreamParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ServiceWorkerFetchResponseCallbackOnResponseStreamParams() {
            this(0);
        }

        public static ServiceWorkerFetchResponseCallbackOnResponseStreamParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerFetchResponseCallbackOnResponseStreamParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ServiceWorkerFetchResponseCallbackOnResponseStreamParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerFetchResponseCallbackOnResponseStreamParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ServiceWorkerFetchResponseCallbackOnResponseStreamParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.response = FetchApiResponse.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.bodyAsStream = ServiceWorkerStreamHandle.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.dispatchEventTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
            
            encoder0.encode(this.response, 8, false);
            
            encoder0.encode(this.bodyAsStream, 16, false);
            
            encoder0.encode(this.dispatchEventTime, 24, false);
        }
    }



    
    static final class ServiceWorkerFetchResponseCallbackOnFallbackParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo_base.mojom.Time dispatchEventTime;

        private ServiceWorkerFetchResponseCallbackOnFallbackParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ServiceWorkerFetchResponseCallbackOnFallbackParams() {
            this(0);
        }

        public static ServiceWorkerFetchResponseCallbackOnFallbackParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerFetchResponseCallbackOnFallbackParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ServiceWorkerFetchResponseCallbackOnFallbackParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerFetchResponseCallbackOnFallbackParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ServiceWorkerFetchResponseCallbackOnFallbackParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.dispatchEventTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
            
            encoder0.encode(this.dispatchEventTime, 8, false);
        }
    }



}
