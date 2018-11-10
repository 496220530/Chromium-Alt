
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/p2p.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


class P2pNetworkNotificationClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<P2pNetworkNotificationClient, P2pNetworkNotificationClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<P2pNetworkNotificationClient, P2pNetworkNotificationClient.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.P2PNetworkNotificationClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, P2pNetworkNotificationClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public P2pNetworkNotificationClient[] buildArray(int size) {
          return new P2pNetworkNotificationClient[size];
        }
    };


    private static final int NETWORK_LIST_CHANGED_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements P2pNetworkNotificationClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void networkListChanged(
NetworkInterface[] networks, org.chromium.net.interfaces.IpAddress defaultIpv4LocalAddress, org.chromium.net.interfaces.IpAddress defaultIpv6LocalAddress) {

            P2pNetworkNotificationClientNetworkListChangedParams _message = new P2pNetworkNotificationClientNetworkListChangedParams();

            _message.networks = networks;

            _message.defaultIpv4LocalAddress = defaultIpv4LocalAddress;

            _message.defaultIpv6LocalAddress = defaultIpv6LocalAddress;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(NETWORK_LIST_CHANGED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<P2pNetworkNotificationClient> {

        Stub(org.chromium.mojo.system.Core core, P2pNetworkNotificationClient impl) {
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
                                P2pNetworkNotificationClient_Internal.MANAGER, messageWithHeader);





                    case NETWORK_LIST_CHANGED_ORDINAL: {

                        P2pNetworkNotificationClientNetworkListChangedParams data =
                                P2pNetworkNotificationClientNetworkListChangedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().networkListChanged(data.networks, data.defaultIpv4LocalAddress, data.defaultIpv6LocalAddress);
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
                                getCore(), P2pNetworkNotificationClient_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class P2pNetworkNotificationClientNetworkListChangedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public NetworkInterface[] networks;
        public org.chromium.net.interfaces.IpAddress defaultIpv4LocalAddress;
        public org.chromium.net.interfaces.IpAddress defaultIpv6LocalAddress;

        private P2pNetworkNotificationClientNetworkListChangedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public P2pNetworkNotificationClientNetworkListChangedParams() {
            this(0);
        }

        public static P2pNetworkNotificationClientNetworkListChangedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static P2pNetworkNotificationClientNetworkListChangedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static P2pNetworkNotificationClientNetworkListChangedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            P2pNetworkNotificationClientNetworkListChangedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new P2pNetworkNotificationClientNetworkListChangedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.networks = new NetworkInterface[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.networks[i1] = NetworkInterface.decode(decoder2);
                        }
                    }
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.defaultIpv4LocalAddress = org.chromium.net.interfaces.IpAddress.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.defaultIpv6LocalAddress = org.chromium.net.interfaces.IpAddress.decode(decoder1);
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
            
            if (this.networks == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.networks.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.networks.length; ++i0) {
                    
                    encoder1.encode(this.networks[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            encoder0.encode(this.defaultIpv4LocalAddress, 16, false);
            
            encoder0.encode(this.defaultIpv6LocalAddress, 24, false);
        }
    }



}
