package celestial;

class yi_3 {
   public int id_class;
   public String id_break;
   public long id_byte;

   public float id_byte() {
      return (float)(this.id_class & 0xFF) / 255.0F;
   }

   public yi_3(int var1, String var2, long var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public float id_class() {
      return (float)(this.id_class >> 16 & 0xFF) / 255.0F;
   }

   public float id_break() {
      return (float)(this.id_class >> 8 & 0xFF) / 255.0F;
   }

   public float id_protected() {
      return (float)(this.id_class >> 24 & 0xFF) / 255.0F;
   }
}
