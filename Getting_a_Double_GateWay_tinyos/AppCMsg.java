/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'AppCMsg'
 * message type.
 */

public class AppCMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 11;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 0;

    /** Create a new AppCMsg of size 11. */
    public AppCMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new AppCMsg of the given data_length. */
    public AppCMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new AppCMsg with the given data_length
     * and base offset.
     */
    public AppCMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new AppCMsg using the given byte array
     * as backing store.
     */
    public AppCMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new AppCMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public AppCMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new AppCMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public AppCMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new AppCMsg embedded in the given message
     * at the given base offset.
     */
    public AppCMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new AppCMsg embedded in the given message
     * at the given base offset and length.
     */
    public AppCMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <AppCMsg> \n";
      try {
        s += "  [msg_counter=0x"+Long.toHexString(get_msg_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [nodeId=0x"+Long.toHexString(get_nodeId())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [number=0x"+Long.toHexString(get_number())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr0=0x"+Long.toHexString(get_doubleArr0())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr1=0x"+Long.toHexString(get_doubleArr1())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr2=0x"+Long.toHexString(get_doubleArr2())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr3=0x"+Long.toHexString(get_doubleArr3())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr4=0x"+Long.toHexString(get_doubleArr4())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr5=0x"+Long.toHexString(get_doubleArr5())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr6=0x"+Long.toHexString(get_doubleArr6())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [doubleArr7=0x"+Long.toHexString(get_doubleArr7())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: msg_counter
    //   Field type: short, signed
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'msg_counter' is signed (true).
     */
    public static boolean isSigned_msg_counter() {
        return true;
    }

    /**
     * Return whether the field 'msg_counter' is an array (false).
     */
    public static boolean isArray_msg_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'msg_counter'
     */
    public static int offset_msg_counter() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'msg_counter'
     */
    public static int offsetBits_msg_counter() {
        return 0;
    }

    /**
     * Return the value (as a short) of the field 'msg_counter'
     */
    public short get_msg_counter() {
        return (short)getUIntBEElement(offsetBits_msg_counter(), 8);
    }

    /**
     * Set the value of the field 'msg_counter'
     */
    public void set_msg_counter(short value) {
        setUIntBEElement(offsetBits_msg_counter(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'msg_counter'
     */
    public static int size_msg_counter() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'msg_counter'
     */
    public static int sizeBits_msg_counter() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodeId
    //   Field type: short, signed
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeId' is signed (true).
     */
    public static boolean isSigned_nodeId() {
        return true;
    }

    /**
     * Return whether the field 'nodeId' is an array (false).
     */
    public static boolean isArray_nodeId() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeId'
     */
    public static int offset_nodeId() {
        return (8 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeId'
     */
    public static int offsetBits_nodeId() {
        return 8;
    }

    /**
     * Return the value (as a short) of the field 'nodeId'
     */
    public short get_nodeId() {
        return (short)getUIntBEElement(offsetBits_nodeId(), 8);
    }

    /**
     * Set the value of the field 'nodeId'
     */
    public void set_nodeId(short value) {
        setUIntBEElement(offsetBits_nodeId(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeId'
     */
    public static int size_nodeId() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeId'
     */
    public static int sizeBits_nodeId() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: number
    //   Field type: short, signed
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'number' is signed (true).
     */
    public static boolean isSigned_number() {
        return true;
    }

    /**
     * Return whether the field 'number' is an array (false).
     */
    public static boolean isArray_number() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'number'
     */
    public static int offset_number() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'number'
     */
    public static int offsetBits_number() {
        return 16;
    }

    /**
     * Return the value (as a short) of the field 'number'
     */
    public short get_number() {
        return (short)getUIntBEElement(offsetBits_number(), 8);
    }

    /**
     * Set the value of the field 'number'
     */
    public void set_number(short value) {
        setUIntBEElement(offsetBits_number(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'number'
     */
    public static int size_number() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'number'
     */
    public static int sizeBits_number() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr0
    //   Field type: byte, signed
    //   Offset (bits): 24
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr0' is signed (true).
     */
    public static boolean isSigned_doubleArr0() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr0' is an array (false).
     */
    public static boolean isArray_doubleArr0() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr0'
     */
    public static int offset_doubleArr0() {
        return (24 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr0'
     */
    public static int offsetBits_doubleArr0() {
        return 24;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr0'
     */
    public byte get_doubleArr0() {
        return (byte)getSIntBEElement(offsetBits_doubleArr0(), 8);
    }

    /**
     * Set the value of the field 'doubleArr0'
     */
    public void set_doubleArr0(byte value) {
        setSIntBEElement(offsetBits_doubleArr0(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr0'
     */
    public static int size_doubleArr0() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr0'
     */
    public static int sizeBits_doubleArr0() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr1
    //   Field type: byte, signed
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr1' is signed (true).
     */
    public static boolean isSigned_doubleArr1() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr1' is an array (false).
     */
    public static boolean isArray_doubleArr1() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr1'
     */
    public static int offset_doubleArr1() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr1'
     */
    public static int offsetBits_doubleArr1() {
        return 32;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr1'
     */
    public byte get_doubleArr1() {
        return (byte)getSIntBEElement(offsetBits_doubleArr1(), 8);
    }

    /**
     * Set the value of the field 'doubleArr1'
     */
    public void set_doubleArr1(byte value) {
        setSIntBEElement(offsetBits_doubleArr1(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr1'
     */
    public static int size_doubleArr1() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr1'
     */
    public static int sizeBits_doubleArr1() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr2
    //   Field type: byte, signed
    //   Offset (bits): 40
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr2' is signed (true).
     */
    public static boolean isSigned_doubleArr2() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr2' is an array (false).
     */
    public static boolean isArray_doubleArr2() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr2'
     */
    public static int offset_doubleArr2() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr2'
     */
    public static int offsetBits_doubleArr2() {
        return 40;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr2'
     */
    public byte get_doubleArr2() {
        return (byte)getSIntBEElement(offsetBits_doubleArr2(), 8);
    }

    /**
     * Set the value of the field 'doubleArr2'
     */
    public void set_doubleArr2(byte value) {
        setSIntBEElement(offsetBits_doubleArr2(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr2'
     */
    public static int size_doubleArr2() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr2'
     */
    public static int sizeBits_doubleArr2() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr3
    //   Field type: byte, signed
    //   Offset (bits): 48
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr3' is signed (true).
     */
    public static boolean isSigned_doubleArr3() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr3' is an array (false).
     */
    public static boolean isArray_doubleArr3() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr3'
     */
    public static int offset_doubleArr3() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr3'
     */
    public static int offsetBits_doubleArr3() {
        return 48;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr3'
     */
    public byte get_doubleArr3() {
        return (byte)getSIntBEElement(offsetBits_doubleArr3(), 8);
    }

    /**
     * Set the value of the field 'doubleArr3'
     */
    public void set_doubleArr3(byte value) {
        setSIntBEElement(offsetBits_doubleArr3(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr3'
     */
    public static int size_doubleArr3() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr3'
     */
    public static int sizeBits_doubleArr3() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr4
    //   Field type: byte, signed
    //   Offset (bits): 56
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr4' is signed (true).
     */
    public static boolean isSigned_doubleArr4() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr4' is an array (false).
     */
    public static boolean isArray_doubleArr4() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr4'
     */
    public static int offset_doubleArr4() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr4'
     */
    public static int offsetBits_doubleArr4() {
        return 56;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr4'
     */
    public byte get_doubleArr4() {
        return (byte)getSIntBEElement(offsetBits_doubleArr4(), 8);
    }

    /**
     * Set the value of the field 'doubleArr4'
     */
    public void set_doubleArr4(byte value) {
        setSIntBEElement(offsetBits_doubleArr4(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr4'
     */
    public static int size_doubleArr4() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr4'
     */
    public static int sizeBits_doubleArr4() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr5
    //   Field type: byte, signed
    //   Offset (bits): 64
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr5' is signed (true).
     */
    public static boolean isSigned_doubleArr5() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr5' is an array (false).
     */
    public static boolean isArray_doubleArr5() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr5'
     */
    public static int offset_doubleArr5() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr5'
     */
    public static int offsetBits_doubleArr5() {
        return 64;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr5'
     */
    public byte get_doubleArr5() {
        return (byte)getSIntBEElement(offsetBits_doubleArr5(), 8);
    }

    /**
     * Set the value of the field 'doubleArr5'
     */
    public void set_doubleArr5(byte value) {
        setSIntBEElement(offsetBits_doubleArr5(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr5'
     */
    public static int size_doubleArr5() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr5'
     */
    public static int sizeBits_doubleArr5() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr6
    //   Field type: byte, signed
    //   Offset (bits): 72
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr6' is signed (true).
     */
    public static boolean isSigned_doubleArr6() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr6' is an array (false).
     */
    public static boolean isArray_doubleArr6() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr6'
     */
    public static int offset_doubleArr6() {
        return (72 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr6'
     */
    public static int offsetBits_doubleArr6() {
        return 72;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr6'
     */
    public byte get_doubleArr6() {
        return (byte)getSIntBEElement(offsetBits_doubleArr6(), 8);
    }

    /**
     * Set the value of the field 'doubleArr6'
     */
    public void set_doubleArr6(byte value) {
        setSIntBEElement(offsetBits_doubleArr6(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr6'
     */
    public static int size_doubleArr6() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr6'
     */
    public static int sizeBits_doubleArr6() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: doubleArr7
    //   Field type: byte, signed
    //   Offset (bits): 80
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'doubleArr7' is signed (true).
     */
    public static boolean isSigned_doubleArr7() {
        return true;
    }

    /**
     * Return whether the field 'doubleArr7' is an array (false).
     */
    public static boolean isArray_doubleArr7() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'doubleArr7'
     */
    public static int offset_doubleArr7() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'doubleArr7'
     */
    public static int offsetBits_doubleArr7() {
        return 80;
    }

    /**
     * Return the value (as a byte) of the field 'doubleArr7'
     */
    public byte get_doubleArr7() {
        return (byte)getSIntBEElement(offsetBits_doubleArr7(), 8);
    }

    /**
     * Set the value of the field 'doubleArr7'
     */
    public void set_doubleArr7(byte value) {
        setSIntBEElement(offsetBits_doubleArr7(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'doubleArr7'
     */
    public static int size_doubleArr7() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'doubleArr7'
     */
    public static int sizeBits_doubleArr7() {
        return 8;
    }

}
