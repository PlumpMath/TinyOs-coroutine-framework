/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'AppCMsg'
 * message type.
 */

public class AppCMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 3;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 0;

    /** Create a new AppCMsg of size 3. */
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
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: msg_counter
    //   Field type: short, unsigned
    //   Offset (bits): 0
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'msg_counter' is signed (false).
     */
    public static boolean isSigned_msg_counter() {
        return false;
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
    //   Field type: short, unsigned
    //   Offset (bits): 8
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeId' is signed (false).
     */
    public static boolean isSigned_nodeId() {
        return false;
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
    //   Field type: short, unsigned
    //   Offset (bits): 16
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'number' is signed (false).
     */
    public static boolean isSigned_number() {
        return false;
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

}
