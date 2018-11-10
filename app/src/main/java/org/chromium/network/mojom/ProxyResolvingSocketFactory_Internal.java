
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/proxy_resolving_socket.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class ProxyResolvingSocketFactory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ProxyResolvingSocketFactory, ProxyResolvingSocketFactory.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ProxyResolvingSocketFactory, ProxyResolvingSocketFactory.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.ProxyResolvingSocketFactory";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ProxyResolvingSocketFactory impl) {
            return new Stub(core, impl);
        }

        @Override
        public ProxyResolvingSocketFactory[] buildArray(int size) {
          return new ProxyResolvingSocketFactory[size];
        }
    };


    private static final int CREATE_PROXY_RESOLVING_SOCKET_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ProxyResolvingSocketFactory.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createProxyResolvingSocket(
org.chromium.url.mojom.Url url, boolean useTls, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<ProxyResolvingSocket> socket, 
CreateProxyResolvingSocketResponse callback) {

            ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams _message = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams();

            _message.url = url;

            _message.useTls = useTls;

            _message.trafficAnnotation = trafficAnnotation;

            _message.socket = socket;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CREATE_PROXY_RESOLVING_SOCKET_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ProxyResolvingSocketFactory> {

        Stub(org.chromium.mojo.system.Core core, ProxyResolvingSocketFactory impl) {
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
                                ProxyResolvingSocketFactory_Internal.MANAGER, messageWithHeader);




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
                                getCore(), ProxyResolvingSocketFactory_Internal.MANAGER, messageWithHeader, receiver);







                    case CREATE_PROXY_RESOLVING_SOCKET_ORDINAL: {

                        ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams data =
                                ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createProxyResolvingSocket(data.url, data.useTls, data.trafficAnnotation, data.socket, new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    
    static final class ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url url;
        public boolean useTls;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;
        public org.chromium.mojo.bindings.InterfaceRequest<ProxyResolvingSocket> socket;

        private ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams() {
            this(0);
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.url = org.chromium.url.mojom.Url.decode(decoder1);
                    }
                    {
                        
                    result.useTls = decoder0.readBoolean(16, 0);
                    }
                    {
                        
                    result.socket = decoder0.readInterfaceRequest(20, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder1);
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
            
            encoder0.encode(this.url, 8, false);
            
            encoder0.encode(this.useTls, 16, 0);
            
            encoder0.encode(this.socket, 20, false);
            
            encoder0.encode(this.trafficAnnotation, 24, false);
        }
    }



    
    static final class ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 40;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int result;
        public org.chromium.net.interfaces.IpEndPoint localAddr;
        public org.chromium.net.interfaces.IpEndPoint peerAddr;
        public org.chromium.mojo.system.DataPipe.ConsumerHandle receiveStream;
        public org.chromium.mojo.system.DataPipe.ProducerHandle sendStream;

        private ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams(int version) {
            super(STRUCT_SIZE, version);
            this.receiveStream = org.chromium.mojo.system.InvalidHandle.INSTANCE;
            this.sendStream = org.chromium.mojo.system.InvalidHandle.INSTANCE;
        }

        public ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams() {
            this(0);
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams(elementsOrVersion);
                    {
                        
                    result.result = decoder0.readInt(8);
                    }
                    {
                        
                    result.receiveStream = decoder0.readConsumerHandle(12, true);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.localAddr = org.chromium.net.interfaces.IpEndPoint.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                    result.peerAddr = org.chromium.net.interfaces.IpEndPoint.decode(decoder1);
                    }
                    {
                        
                    result.sendStream = decoder0.readProducerHandle(32, true);
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
            
            encoder0.encode(this.result, 8);
            
            encoder0.encode(this.receiveStream, 12, true);
            
            encoder0.encode(this.localAddr, 16, true);
            
            encoder0.encode(this.peerAddr, 24, true);
            
            encoder0.encode(this.sendStream, 32, true);
        }
    }

    static class ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final ProxyResolvingSocketFactory.CreateProxyResolvingSocketResponse mCallback;

        ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsForwardToCallback(ProxyResolvingSocketFactory.CreateProxyResolvingSocketResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(CREATE_PROXY_RESOLVING_SOCKET_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams response = ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result, response.localAddr, response.peerAddr, response.receiveStream, response.sendStream);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsProxyToResponder implements ProxyResolvingSocketFactory.CreateProxyResolvingSocketResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer result, org.chromium.net.interfaces.IpEndPoint localAddr, org.chromium.net.interfaces.IpEndPoint peerAddr, org.chromium.mojo.system.DataPipe.ConsumerHandle receiveStream, org.chromium.mojo.system.DataPipe.ProducerHandle sendStream) {
            ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams _response = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams();

            _response.result = result;

            _response.localAddr = localAddr;

            _response.peerAddr = peerAddr;

            _response.receiveStream = receiveStream;

            _response.sendStream = sendStream;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CREATE_PROXY_RESOLVING_SOCKET_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
