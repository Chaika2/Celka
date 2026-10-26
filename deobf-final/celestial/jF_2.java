package celestial;

public enum jF_2 {
   FLOAT(4, "Float", 5126),
   UBYTE(1, "Unsigned Byte", 5121),
   BYTE(1, "Byte", 5120),
   USHORT(2, "Unsigned Short", 5123),
   SHORT(2, "Short", 5122),
   UINT(4, "Unsigned Int", 5125),
   INT(4, "Int", 5124);

   private final int size;
   private final String displayName;
   private final int glConstant;

   public int byte_() {
      return this.glConstant;
   }

   private jF_2(int var3, String var4, int var5) {
      this.size = var3;
      this.displayName = var4;
      this.glConstant = var5;
   }

   public int class_() {
      return this.size;
   }

   public String break_() {
      return this.displayName;
   }
}
