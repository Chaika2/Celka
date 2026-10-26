package celestial;

public interface OW extends Ok_1 {
   @Override
   default Ok_1 id_byte(int var1, int var2) {
      return this.id_class((short)var1, (short)var2, 2);
   }

   @Override
   default Ok_1 id_class(float var1, float var2) {
      jv_3 var3 = this.id_case();
      if (var3.id_break() == jL_2.UV && var3.id_byte() == 0) {
         if (var3.id_class() != jF_2.FLOAT) {
            throw new IllegalStateException();
         } else {
            this.id_class(0, var1);
            this.id_class(4, var2);
            this.id_catch();
            return this;
         }
      } else {
         return this;
      }
   }

   static byte id_class(float var0) {
      return (byte)((int)(rfU_2.id_class(var0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }

   @Override
   default Ok_1 id_class(int var1, int var2) {
      jv_3 var3 = this.id_case();
      if (var3.id_break() != jL_2.COLOR) {
         return this;
      } else if (var3.id_class() != jF_2.UBYTE) {
         throw new IllegalStateException();
      } else {
         this.id_class(0, (byte)ColorHelper.id_byte(var1));
         this.id_class(1, (byte)ColorHelper.id_protected(var1));
         this.id_class(2, (byte)ColorHelper.id_break(var1));
         this.id_class(3, (byte)var2);
         this.id_catch();
         return this;
      }
   }

   default Ok_1 id_class(short var1, short var2, int var3) {
      jv_3 var4 = this.id_case();
      if (var4.id_break() != jL_2.UV || var4.id_byte() != var3) {
         return this;
      } else if (var4.id_class() != jF_2.SHORT) {
         throw new IllegalStateException();
      } else {
         this.id_class(0, var1);
         this.id_class(2, var2);
         this.id_catch();
         return this;
      }
   }

   @Override
   default Ok_1 id_class(float var1, float var2, float var3) {
      jv_3 var4 = this.id_case();
      if (var4.id_break() != jL_2.NORMAL) {
         return this;
      } else if (var4.id_class() != jF_2.BYTE) {
         throw new IllegalStateException();
      } else {
         this.id_class(0, id_class(var1));
         this.id_class(1, id_class(var2));
         this.id_class(2, id_class(var3));
         this.id_catch();
         return this;
      }
   }

   void id_class(int var1, byte var2);

   void id_class(int var1, short var2);

   void id_class(int var1, float var2);

   @Override
   default Ok_1 id_class(double var1, double var3, double var5) {
      if (this.id_case().id_class() != jF_2.FLOAT) {
         throw new IllegalStateException();
      } else {
         this.id_class(0, (float)var1);
         this.id_class(4, (float)var3);
         this.id_class(8, (float)var5);
         this.id_catch();
         return this;
      }
   }

   @Override
   default Ok_1 id_class(int var1) {
      jv_3 var2 = this.id_case();
      if (var2.id_break() != jL_2.COLOR) {
         return this;
      } else if (var2.id_class() != jF_2.UBYTE) {
         throw new IllegalStateException();
      } else {
         this.id_class(0, (byte)ColorHelper.id_byte(var1));
         this.id_class(1, (byte)ColorHelper.id_protected(var1));
         this.id_class(2, (byte)ColorHelper.id_break(var1));
         this.id_class(3, (byte)ColorHelper.id_throws(var1));
         this.id_catch();
         return this;
      }
   }

   @Override
   default Ok_1 id_break(int var1, int var2, int var3, int var4) {
      jv_3 var5 = this.id_case();
      if (var5.id_break() != jL_2.COLOR) {
         return this;
      } else if (var5.id_class() != jF_2.UBYTE) {
         throw new IllegalStateException();
      } else {
         this.id_class(0, (byte)var1);
         this.id_class(1, (byte)var2);
         this.id_class(2, (byte)var3);
         this.id_class(3, (byte)var4);
         this.id_catch();
         return this;
      }
   }

   @Override
   default Ok_1 id_break(int var1, int var2) {
      return this.id_class((short)var1, (short)var2, 1);
   }

   void id_catch();

   jv_3 id_case();
}
