# chatroom_io
基于io的本地网络聊天室，初始状态客户端不知道服务器的ip和端口，但知道广播端口，发送广播，服务器端收到消息后回送ip和端口，客户端建立与服务器端的TCP连接，进行后续的收发消息操作。
工流程图见 工作流程图.bmp。
本地运行可通过``cd jar``, `` java -jar server.jar``, ``java -jar client.jar``，开启多个客户端演示效果
