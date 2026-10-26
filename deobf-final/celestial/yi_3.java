package celestial;

class yi_3 {
   public int class_;
   public String break_;
   public long byte_;

   public float byte_() {
      return (float)(this.class_ & 0xFF) / 255.0F;
   }

   public yi_3(int var1, String var2, long var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public float class_() {
      return (float)(this.class_ >> 16 & 0xFF) / 255.0F;
   }

   public float break_() {
      return (float)(this.class_ >> 8 & 0xFF) / 255.0F;
   }

   public float protected_() {
      return (float)(this.class_ >> 24 & 0xFF) / 255.0F;
   }
}
