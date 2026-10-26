package celestial;

public class roH_2 {
   protected byte[] id_class;

   public boolean id_byte() {
      return this.id_class == null;
   }

   private int id_byte(int var1) {
      return var1 >> 1;
   }

   public roH_2() {
   }

   protected roH_2(int var1) {
      this.id_class = new byte[var1];
   }

   public roH_2(byte[] var1) {
      this.id_class = var1;
      if (var1.length != 2048) {
         throw (IllegalArgumentException)rqR_2.id_byte(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + var1.length));
      }
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();

      for (int var2 = 0; var2 < 4096; var2++) {
         var1.append(Integer.toHexString(this.id_class(var2)));
         if ((var2 & 15) == 15) {
            var1.append("\n");
         }

         if ((var2 & 0xFF) == 255) {
            var1.append("\n");
         }
      }

      return var1.toString();
   }

   public byte[] id_class() {
      if (this.id_class == null) {
         this.id_class = new byte[2048];
      }

      return this.id_class;
   }

   private void id_class(int var1, int var2) {
      if (this.id_class == null) {
         this.id_class = new byte[2048];
      }

      int var3 = this.id_byte(var1);
      if (this.id_break(var1)) {
         this.id_class[var3] = (byte)(this.id_class[var3] & 240 | var2 & 15);
      } else {
         this.id_class[var3] = (byte)(this.id_class[var3] & 15 | (var2 & 15) << 4);
      }
   }

   public int id_class(int var1, int var2, int var3) {
      return this.id_class(this.id_break(var1, var2, var3));
   }

   public void id_class(int var1, int var2, int var3, int var4) {
      this.id_class(this.id_break(var1, var2, var3), var4);
   }

   private int id_class(int var1) {
      if (this.id_class == null) {
         return 0;
      } else {
         int var2 = this.id_byte(var1);
         return this.id_break(var1) ? this.id_class[var2] & 15 : this.id_class[var2] >> 4 & 15;
      }
   }

   private boolean id_break(int var1) {
      return (var1 & 1) == 0;
   }

   public roH_2 id_break() {
      return this.id_class == null ? new roH_2() : new roH_2((byte[])this.id_class.clone());
   }

   protected int id_break(int var1, int var2, int var3) {
      return var2 << 8 | var3 << 4 | var1;
   }
}
