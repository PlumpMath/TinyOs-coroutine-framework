interface ProtocolI<msgType>
{
  command void send(msgType *);
  event void receive(msgType *);
}

