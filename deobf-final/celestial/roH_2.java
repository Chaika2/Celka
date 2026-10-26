package celestial;

public class roH_2 {
   protected byte[] class_;

   public boolean byte_() {
      return this.class_ == null;
   }

   private int byte_(int var1) {
      return var1 >> 1;
   }

   public roH_2() {
   }

   protected roH_2(int var1) {
      this.class_ = new byte[var1];
   }

   public roH_2(byte[] var1) {
      this.class_ = var1;
      if (var1.length != 2048) {
         throw (IllegalArgumentException)rqR_2.byte_(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length));
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < 4096; var2++) {
         var1.append(Integer.toHexString(this.class_(var2)));
         if ((var2 & 15) == 15) {
            var1.append("\n");
         }

         if ((var2 & 0xFF) == 255) {
            var1.append("\n");
         }
      }

      return var1.toString();
   }

   public byte[] class_() {
      if (this.class_ == null) {
         this.class_ = new byte[2048];
      }

      return this.class_;
   }

   private void class_(int var1, int var2) {
      if (this.class_ == null) {
         this.class_ = new byte[2048];
      }

      int var3 = this.byte_(var1);
      if (this.break_(var1)) {
         this.class_[var3] = (byte)(this.class_[var3] & 240 | var2 & 15);
      } else {
         this.class_[var3] = (byte)(this.class_[var3] & 15 | (var2 & 15) << 4);
      }
   }

   public int class_(int var1, int var2, int var3) {
      return this.class_(this.break_(var1, var2, var3));
   }

   public void class_(int var1, int var2, int var3, int var4) {
      this.class_(this.break_(var1, var2, var3), var4);
   }

   private int class_(int var1) {
      if (this.class_ == null) {
         return 0;
      } else {
         int var2 = this.byte_(var1);
         return this.break_(var1) ? this.class_[var2] & 15 : this.class_[var2] >> 4 & 15;
      }
   }

   private boolean break_(int var1) {
      return (var1 & 1) == 0;
   }

   public roH_2 break_() {
      return this.class_ == null ? new roH_2() : new roH_2((byte[])this.class_.clone());
   }

   protected int break_(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }
}
