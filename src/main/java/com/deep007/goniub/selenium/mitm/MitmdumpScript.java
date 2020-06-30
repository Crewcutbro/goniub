package com.deep007.goniub.selenium.mitm;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class MitmdumpScript {

	public static final String mitm_flow_pb2_grpc = "# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!\n" + 
			"import grpc\n" + 
			"\n" + 
			"import mitm_flow_pb2 as mitm__flow__pb2\n" + 
			"\n" + 
			"\n" + 
			"class MitmFlowMonitorStub(object):\n" + 
			"    \"\"\"Missing associated documentation comment in .proto file\"\"\"\n" + 
			"\n" + 
			"    def __init__(self, channel):\n" + 
			"        \"\"\"Constructor.\n" + 
			"\n" + 
			"        Args:\n" + 
			"            channel: A grpc.Channel.\n" + 
			"        \"\"\"\n" + 
			"        self.onMitmRequest = channel.unary_unary(\n" + 
			"                '/mitm.MitmFlowMonitor/onMitmRequest',\n" + 
			"                request_serializer=mitm__flow__pb2.MitmRequest.SerializeToString,\n" + 
			"                response_deserializer=mitm__flow__pb2.MitmRequest.FromString,\n" + 
			"                )\n" + 
			"        self.onMitmResponse = channel.unary_unary(\n" + 
			"                '/mitm.MitmFlowMonitor/onMitmResponse',\n" + 
			"                request_serializer=mitm__flow__pb2.MitmResponse.SerializeToString,\n" + 
			"                response_deserializer=mitm__flow__pb2.MitmResponse.FromString,\n" + 
			"                )\n" + 
			"\n" + 
			"\n" + 
			"class MitmFlowMonitorServicer(object):\n" + 
			"    \"\"\"Missing associated documentation comment in .proto file\"\"\"\n" + 
			"\n" + 
			"    def onMitmRequest(self, request, context):\n" + 
			"        \"\"\"Missing associated documentation comment in .proto file\"\"\"\n" + 
			"        context.set_code(grpc.StatusCode.UNIMPLEMENTED)\n" + 
			"        context.set_details('Method not implemented!')\n" + 
			"        raise NotImplementedError('Method not implemented!')\n" + 
			"\n" + 
			"    def onMitmResponse(self, request, context):\n" + 
			"        \"\"\"Missing associated documentation comment in .proto file\"\"\"\n" + 
			"        context.set_code(grpc.StatusCode.UNIMPLEMENTED)\n" + 
			"        context.set_details('Method not implemented!')\n" + 
			"        raise NotImplementedError('Method not implemented!')\n" + 
			"\n" + 
			"\n" + 
			"def add_MitmFlowMonitorServicer_to_server(servicer, server):\n" + 
			"    rpc_method_handlers = {\n" + 
			"            'onMitmRequest': grpc.unary_unary_rpc_method_handler(\n" + 
			"                    servicer.onMitmRequest,\n" + 
			"                    request_deserializer=mitm__flow__pb2.MitmRequest.FromString,\n" + 
			"                    response_serializer=mitm__flow__pb2.MitmRequest.SerializeToString,\n" + 
			"            ),\n" + 
			"            'onMitmResponse': grpc.unary_unary_rpc_method_handler(\n" + 
			"                    servicer.onMitmResponse,\n" + 
			"                    request_deserializer=mitm__flow__pb2.MitmResponse.FromString,\n" + 
			"                    response_serializer=mitm__flow__pb2.MitmResponse.SerializeToString,\n" + 
			"            ),\n" + 
			"    }\n" + 
			"    generic_handler = grpc.method_handlers_generic_handler(\n" + 
			"            'mitm.MitmFlowMonitor', rpc_method_handlers)\n" + 
			"    server.add_generic_rpc_handlers((generic_handler,))\n" + 
			"\n" + 
			"\n" + 
			" # This class is part of an EXPERIMENTAL API.\n" + 
			"class MitmFlowMonitor(object):\n" + 
			"    \"\"\"Missing associated documentation comment in .proto file\"\"\"\n" + 
			"\n" + 
			"    @staticmethod\n" + 
			"    def onMitmRequest(request,\n" + 
			"            target,\n" + 
			"            options=(),\n" + 
			"            channel_credentials=None,\n" + 
			"            call_credentials=None,\n" + 
			"            compression=None,\n" + 
			"            wait_for_ready=None,\n" + 
			"            timeout=None,\n" + 
			"            metadata=None):\n" + 
			"        return grpc.experimental.unary_unary(request, target, '/mitm.MitmFlowMonitor/onMitmRequest',\n" + 
			"            mitm__flow__pb2.MitmRequest.SerializeToString,\n" + 
			"            mitm__flow__pb2.MitmRequest.FromString,\n" + 
			"            options, channel_credentials,\n" + 
			"            call_credentials, compression, wait_for_ready, timeout, metadata)\n" + 
			"\n" + 
			"    @staticmethod\n" + 
			"    def onMitmResponse(request,\n" + 
			"            target,\n" + 
			"            options=(),\n" + 
			"            channel_credentials=None,\n" + 
			"            call_credentials=None,\n" + 
			"            compression=None,\n" + 
			"            wait_for_ready=None,\n" + 
			"            timeout=None,\n" + 
			"            metadata=None):\n" + 
			"        return grpc.experimental.unary_unary(request, target, '/mitm.MitmFlowMonitor/onMitmResponse',\n" + 
			"            mitm__flow__pb2.MitmResponse.SerializeToString,\n" + 
			"            mitm__flow__pb2.MitmResponse.FromString,\n" + 
			"            options, channel_credentials,\n" + 
			"            call_credentials, compression, wait_for_ready, timeout, metadata)\n" + 
			"";
	
	public static final String mitm_flow_pb2 = "# -*- coding: utf-8 -*-\n" + 
			"# Generated by the protocol buffer compiler.  DO NOT EDIT!\n" + 
			"# source: mitm_flow.proto\n" + 
			"\n" + 
			"from google.protobuf import descriptor as _descriptor\n" + 
			"from google.protobuf import message as _message\n" + 
			"from google.protobuf import reflection as _reflection\n" + 
			"from google.protobuf import symbol_database as _symbol_database\n" + 
			"# @@protoc_insertion_point(imports)\n" + 
			"\n" + 
			"_sym_db = _symbol_database.Default()\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"DESCRIPTOR = _descriptor.FileDescriptor(\n" + 
			"  name='mitm_flow.proto',\n" + 
			"  package='mitm',\n" + 
			"  syntax='proto3',\n" + 
			"  serialized_options=b'\\n(com.deep007.goniub.selenium.mitm.monitorB\\024MitmFlowMonitorProtoP\\001',\n" + 
			"  serialized_pb=b'\\n\\x0fmitm_flow.proto\\x12\\x04mitm\\\")\\n\\nMitmHeader\\x12\\x0c\\n\\x04name\\x18\\x01 \\x01(\\t\\x12\\r\\n\\x05value\\x18\\x02 \\x01(\\t\\\"6\\n\\x0bMitmBinding\\x12\\x14\\n\\x0cmitmserverId\\x18\\x01 \\x01(\\t\\x12\\x11\\n\\tbrowserId\\x18\\x02 \\x01(\\t\\\"\\x86\\x01\\n\\x0bMitmRequest\\x12&\\n\\x0bmitmBinding\\x18\\x01 \\x01(\\x0b\\x32\\x11.mitm.MitmBinding\\x12\\x0b\\n\\x03url\\x18\\x02 \\x01(\\t\\x12\\x0e\\n\\x06method\\x18\\x03 \\x01(\\t\\x12!\\n\\x07headers\\x18\\x04 \\x03(\\x0b\\x32\\x10.mitm.MitmHeader\\x12\\x0f\\n\\x07\\x63ontent\\x18\\x05 \\x01(\\x0c\\\"\\xa2\\x01\\n\\x0cMitmResponse\\x12&\\n\\x0bmitmBinding\\x18\\x01 \\x01(\\x0b\\x32\\x11.mitm.MitmBinding\\x12\\\"\\n\\x07request\\x18\\x02 \\x01(\\x0b\\x32\\x11.mitm.MitmRequest\\x12!\\n\\x07headers\\x18\\x03 \\x03(\\x0b\\x32\\x10.mitm.MitmHeader\\x12\\x0f\\n\\x07\\x63ontent\\x18\\x05 \\x01(\\x0c\\x12\\x12\\n\\nstatusCode\\x18\\x06 \\x01(\\x05\\x32\\x86\\x01\\n\\x0fMitmFlowMonitor\\x12\\x37\\n\\ronMitmRequest\\x12\\x11.mitm.MitmRequest\\x1a\\x11.mitm.MitmRequest\\\"\\x00\\x12:\\n\\x0eonMitmResponse\\x12\\x12.mitm.MitmResponse\\x1a\\x12.mitm.MitmResponse\\\"\\x00\\x42\\x42\\n(com.deep007.goniub.selenium.mitm.monitorB\\x14MitmFlowMonitorProtoP\\x01\\x62\\x06proto3'\n" + 
			")\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"_MITMHEADER = _descriptor.Descriptor(\n" + 
			"  name='MitmHeader',\n" + 
			"  full_name='mitm.MitmHeader',\n" + 
			"  filename=None,\n" + 
			"  file=DESCRIPTOR,\n" + 
			"  containing_type=None,\n" + 
			"  fields=[\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='name', full_name='mitm.MitmHeader.name', index=0,\n" + 
			"      number=1, type=9, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\".decode('utf-8'),\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='value', full_name='mitm.MitmHeader.value', index=1,\n" + 
			"      number=2, type=9, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\".decode('utf-8'),\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"  ],\n" + 
			"  extensions=[\n" + 
			"  ],\n" + 
			"  nested_types=[],\n" + 
			"  enum_types=[\n" + 
			"  ],\n" + 
			"  serialized_options=None,\n" + 
			"  is_extendable=False,\n" + 
			"  syntax='proto3',\n" + 
			"  extension_ranges=[],\n" + 
			"  oneofs=[\n" + 
			"  ],\n" + 
			"  serialized_start=25,\n" + 
			"  serialized_end=66,\n" + 
			")\n" + 
			"\n" + 
			"\n" + 
			"_MITMBINDING = _descriptor.Descriptor(\n" + 
			"  name='MitmBinding',\n" + 
			"  full_name='mitm.MitmBinding',\n" + 
			"  filename=None,\n" + 
			"  file=DESCRIPTOR,\n" + 
			"  containing_type=None,\n" + 
			"  fields=[\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='mitmserverId', full_name='mitm.MitmBinding.mitmserverId', index=0,\n" + 
			"      number=1, type=9, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\".decode('utf-8'),\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='browserId', full_name='mitm.MitmBinding.browserId', index=1,\n" + 
			"      number=2, type=9, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\".decode('utf-8'),\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"  ],\n" + 
			"  extensions=[\n" + 
			"  ],\n" + 
			"  nested_types=[],\n" + 
			"  enum_types=[\n" + 
			"  ],\n" + 
			"  serialized_options=None,\n" + 
			"  is_extendable=False,\n" + 
			"  syntax='proto3',\n" + 
			"  extension_ranges=[],\n" + 
			"  oneofs=[\n" + 
			"  ],\n" + 
			"  serialized_start=68,\n" + 
			"  serialized_end=122,\n" + 
			")\n" + 
			"\n" + 
			"\n" + 
			"_MITMREQUEST = _descriptor.Descriptor(\n" + 
			"  name='MitmRequest',\n" + 
			"  full_name='mitm.MitmRequest',\n" + 
			"  filename=None,\n" + 
			"  file=DESCRIPTOR,\n" + 
			"  containing_type=None,\n" + 
			"  fields=[\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='mitmBinding', full_name='mitm.MitmRequest.mitmBinding', index=0,\n" + 
			"      number=1, type=11, cpp_type=10, label=1,\n" + 
			"      has_default_value=False, default_value=None,\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='url', full_name='mitm.MitmRequest.url', index=1,\n" + 
			"      number=2, type=9, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\".decode('utf-8'),\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='method', full_name='mitm.MitmRequest.method', index=2,\n" + 
			"      number=3, type=9, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\".decode('utf-8'),\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='headers', full_name='mitm.MitmRequest.headers', index=3,\n" + 
			"      number=4, type=11, cpp_type=10, label=3,\n" + 
			"      has_default_value=False, default_value=[],\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='content', full_name='mitm.MitmRequest.content', index=4,\n" + 
			"      number=5, type=12, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\",\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"  ],\n" + 
			"  extensions=[\n" + 
			"  ],\n" + 
			"  nested_types=[],\n" + 
			"  enum_types=[\n" + 
			"  ],\n" + 
			"  serialized_options=None,\n" + 
			"  is_extendable=False,\n" + 
			"  syntax='proto3',\n" + 
			"  extension_ranges=[],\n" + 
			"  oneofs=[\n" + 
			"  ],\n" + 
			"  serialized_start=125,\n" + 
			"  serialized_end=259,\n" + 
			")\n" + 
			"\n" + 
			"\n" + 
			"_MITMRESPONSE = _descriptor.Descriptor(\n" + 
			"  name='MitmResponse',\n" + 
			"  full_name='mitm.MitmResponse',\n" + 
			"  filename=None,\n" + 
			"  file=DESCRIPTOR,\n" + 
			"  containing_type=None,\n" + 
			"  fields=[\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='mitmBinding', full_name='mitm.MitmResponse.mitmBinding', index=0,\n" + 
			"      number=1, type=11, cpp_type=10, label=1,\n" + 
			"      has_default_value=False, default_value=None,\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='request', full_name='mitm.MitmResponse.request', index=1,\n" + 
			"      number=2, type=11, cpp_type=10, label=1,\n" + 
			"      has_default_value=False, default_value=None,\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='headers', full_name='mitm.MitmResponse.headers', index=2,\n" + 
			"      number=3, type=11, cpp_type=10, label=3,\n" + 
			"      has_default_value=False, default_value=[],\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='content', full_name='mitm.MitmResponse.content', index=3,\n" + 
			"      number=5, type=12, cpp_type=9, label=1,\n" + 
			"      has_default_value=False, default_value=b\"\",\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"    _descriptor.FieldDescriptor(\n" + 
			"      name='statusCode', full_name='mitm.MitmResponse.statusCode', index=4,\n" + 
			"      number=6, type=5, cpp_type=1, label=1,\n" + 
			"      has_default_value=False, default_value=0,\n" + 
			"      message_type=None, enum_type=None, containing_type=None,\n" + 
			"      is_extension=False, extension_scope=None,\n" + 
			"      serialized_options=None, file=DESCRIPTOR),\n" + 
			"  ],\n" + 
			"  extensions=[\n" + 
			"  ],\n" + 
			"  nested_types=[],\n" + 
			"  enum_types=[\n" + 
			"  ],\n" + 
			"  serialized_options=None,\n" + 
			"  is_extendable=False,\n" + 
			"  syntax='proto3',\n" + 
			"  extension_ranges=[],\n" + 
			"  oneofs=[\n" + 
			"  ],\n" + 
			"  serialized_start=262,\n" + 
			"  serialized_end=424,\n" + 
			")\n" + 
			"\n" + 
			"_MITMREQUEST.fields_by_name['mitmBinding'].message_type = _MITMBINDING\n" + 
			"_MITMREQUEST.fields_by_name['headers'].message_type = _MITMHEADER\n" + 
			"_MITMRESPONSE.fields_by_name['mitmBinding'].message_type = _MITMBINDING\n" + 
			"_MITMRESPONSE.fields_by_name['request'].message_type = _MITMREQUEST\n" + 
			"_MITMRESPONSE.fields_by_name['headers'].message_type = _MITMHEADER\n" + 
			"DESCRIPTOR.message_types_by_name['MitmHeader'] = _MITMHEADER\n" + 
			"DESCRIPTOR.message_types_by_name['MitmBinding'] = _MITMBINDING\n" + 
			"DESCRIPTOR.message_types_by_name['MitmRequest'] = _MITMREQUEST\n" + 
			"DESCRIPTOR.message_types_by_name['MitmResponse'] = _MITMRESPONSE\n" + 
			"_sym_db.RegisterFileDescriptor(DESCRIPTOR)\n" + 
			"\n" + 
			"MitmHeader = _reflection.GeneratedProtocolMessageType('MitmHeader', (_message.Message,), {\n" + 
			"  'DESCRIPTOR' : _MITMHEADER,\n" + 
			"  '__module__' : 'mitm_flow_pb2'\n" + 
			"  # @@protoc_insertion_point(class_scope:mitm.MitmHeader)\n" + 
			"  })\n" + 
			"_sym_db.RegisterMessage(MitmHeader)\n" + 
			"\n" + 
			"MitmBinding = _reflection.GeneratedProtocolMessageType('MitmBinding', (_message.Message,), {\n" + 
			"  'DESCRIPTOR' : _MITMBINDING,\n" + 
			"  '__module__' : 'mitm_flow_pb2'\n" + 
			"  # @@protoc_insertion_point(class_scope:mitm.MitmBinding)\n" + 
			"  })\n" + 
			"_sym_db.RegisterMessage(MitmBinding)\n" + 
			"\n" + 
			"MitmRequest = _reflection.GeneratedProtocolMessageType('MitmRequest', (_message.Message,), {\n" + 
			"  'DESCRIPTOR' : _MITMREQUEST,\n" + 
			"  '__module__' : 'mitm_flow_pb2'\n" + 
			"  # @@protoc_insertion_point(class_scope:mitm.MitmRequest)\n" + 
			"  })\n" + 
			"_sym_db.RegisterMessage(MitmRequest)\n" + 
			"\n" + 
			"MitmResponse = _reflection.GeneratedProtocolMessageType('MitmResponse', (_message.Message,), {\n" + 
			"  'DESCRIPTOR' : _MITMRESPONSE,\n" + 
			"  '__module__' : 'mitm_flow_pb2'\n" + 
			"  # @@protoc_insertion_point(class_scope:mitm.MitmResponse)\n" + 
			"  })\n" + 
			"_sym_db.RegisterMessage(MitmResponse)\n" + 
			"\n" + 
			"\n" + 
			"DESCRIPTOR._options = None\n" + 
			"\n" + 
			"_MITMFLOWMONITOR = _descriptor.ServiceDescriptor(\n" + 
			"  name='MitmFlowMonitor',\n" + 
			"  full_name='mitm.MitmFlowMonitor',\n" + 
			"  file=DESCRIPTOR,\n" + 
			"  index=0,\n" + 
			"  serialized_options=None,\n" + 
			"  serialized_start=427,\n" + 
			"  serialized_end=561,\n" + 
			"  methods=[\n" + 
			"  _descriptor.MethodDescriptor(\n" + 
			"    name='onMitmRequest',\n" + 
			"    full_name='mitm.MitmFlowMonitor.onMitmRequest',\n" + 
			"    index=0,\n" + 
			"    containing_service=None,\n" + 
			"    input_type=_MITMREQUEST,\n" + 
			"    output_type=_MITMREQUEST,\n" + 
			"    serialized_options=None,\n" + 
			"  ),\n" + 
			"  _descriptor.MethodDescriptor(\n" + 
			"    name='onMitmResponse',\n" + 
			"    full_name='mitm.MitmFlowMonitor.onMitmResponse',\n" + 
			"    index=1,\n" + 
			"    containing_service=None,\n" + 
			"    input_type=_MITMRESPONSE,\n" + 
			"    output_type=_MITMRESPONSE,\n" + 
			"    serialized_options=None,\n" + 
			"  ),\n" + 
			"])\n" + 
			"_sym_db.RegisterServiceDescriptor(_MITMFLOWMONITOR)\n" + 
			"\n" + 
			"DESCRIPTOR.services_by_name['MitmFlowMonitor'] = _MITMFLOWMONITOR\n" + 
			"\n" + 
			"# @@protoc_insertion_point(module_scope)\n" + 
			"";
	
	public static final String mitm_start_script = "import re\n" + 
			"import sys\n" + 
			"import grpc\n" + 
			"import mitm_flow_pb2\n" + 
			"import mitm_flow_pb2_grpc\n" + 
			"from mitmproxy import http\n" + 
			"\n" + 
			"_HOST = '127.0.0.1'\n" + 
			"_PORT = '8013'\n" + 
			"\n" + 
			"channel = grpc.insecure_channel(\"{0}:{1}\".format(_HOST, _PORT))\n" + 
			"client = mitm_flow_pb2_grpc.MitmFlowMonitorStub(channel=channel)\n" + 
			"\n" + 
			"def getBrowserId(userAgent):\n" + 
			"    if not userAgent:\n" + 
			"        return None\n" + 
			"    m = re.search(\"BrowserId/(\\w+)\", userAgent)\n" + 
			"    if not m:\n" + 
			"        return None\n" + 
			"    return m.group(1)\n" + 
			"\n" + 
			"def createMitmRequest(req:http.HTTPRequest):\n" + 
			"    userAgent = req.headers[\"User-Agent\"];\n" + 
			"    browserId = getBrowserId(userAgent)\n" + 
			"    if not browserId:\n" + 
			"        return None\n" + 
			"    mitmBinding = mitm_flow_pb2.MitmBinding(mitmserverId=\"\", browserId=browserId);\n" + 
			"    mitmHeaders = []\n" + 
			"    headersMap = dict(req.headers)\n" + 
			"    for (k,v) in  headersMap.items():\n" + 
			"        mitmHeader = mitm_flow_pb2.MitmHeader(name=k, value=v)\n" + 
			"        mitmHeaders.append(mitmHeader)\n" + 
			"    mitmRequest = mitm_flow_pb2.MitmRequest(mitmBinding=mitmBinding, url=req.url, method=req.method, headers=mitmHeaders, content=req.content)\n" + 
			"    return mitmRequest\n" + 
			"\n" + 
			"def request(flow: http.HTTPFlow) -> None:\n" + 
			"    req:http.HTTPRequest = flow.request\n" + 
			"    mitmRequest = createMitmRequest(req)\n" + 
			"    if mitmRequest == None:\n" + 
			"        return\n" + 
			"    fixedMitmRequest = client.onMitmRequest(mitmRequest)\n" + 
			"    req.url = fixedMitmRequest.url\n" + 
			"    req.method = fixedMitmRequest.method\n" + 
			"    for fixedHeader in fixedMitmRequest.headers:\n" + 
			"        req.headers[fixedHeader.name] = fixedHeader.value\n" + 
			"    req.content = mitmRequest.content\n" + 
			"    \n" + 
			"\n" + 
			"def response(flow: http.HTTPFlow) -> None:\n" + 
			"    req:http.HTTPRequest = flow.request\n" + 
			"    res:http.HTTPResponse = flow.response\n" + 
			"    mitmRequest = createMitmRequest(req)\n" + 
			"    if mitmRequest == None:\n" + 
			"        return\n" + 
			"    mitmBinding = mitmRequest.mitmBinding;\n" + 
			"    mitmHeaders = []\n" + 
			"    headersMap = dict(res.headers)\n" + 
			"    for (k,v) in  headersMap.items():\n" + 
			"        mitmHeader = mitm_flow_pb2.MitmHeader(name=k, value=v)\n" + 
			"        mitmHeaders.append(mitmHeader)\n" + 
			"    mitmResponse = mitm_flow_pb2.MitmResponse(mitmBinding=mitmRequest.mitmBinding, request=mitmRequest, headers=mitmHeaders, content=res.content, statusCode=res.status_code)\n" + 
			"    fixedMitmResponse = client.onMitmResponse(mitmResponse)\n" + 
			"    for fixedHeader in fixedMitmResponse.headers:\n" + 
			"        res.headers[fixedHeader.name] = fixedHeader.value\n" + 
			"    res.content = mitmResponse.content\n" + 
			"    res.status_code = mitmResponse.statusCode";
	
	static {
		try {
			File mitm_flow_pb2_grpc_file = new File("mitm_flow_pb2_grpc.py");
			FileUtils.write(mitm_flow_pb2_grpc_file, mitm_flow_pb2_grpc, false);
			File mitm_flow_pb2_file = new File("mitm_flow_pb2.py");
			FileUtils.write(mitm_flow_pb2_file, mitm_flow_pb2, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String init_mitm_start_script(int callbackServerPort) {
		try {
			File mitm_start_script_file = new File("mitm_start_script_call_"+callbackServerPort+".py");
			String new_mitm_start_script = mitm_start_script.replace("8013", String.valueOf(callbackServerPort));
			FileUtils.write(mitm_start_script_file, new_mitm_start_script, false);
			return mitm_start_script_file.getAbsolutePath();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
