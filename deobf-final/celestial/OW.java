package celestial;

public interface OW extends Ok_1 {
   @Override
   default Ok_1 byte_(int var1, int var2) {
      return this.class_((short)var1, (short)var2, 2);
   }

   @Override
   default Ok_1 class_(float var1, float var2) {
      jv_3 var3 = this.case_();
      if (var3.break_() == jL_2.UV && var3.byte_() == 0) {
         if (var3.class_() != jF_2.FLOAT) {
            throw new IllegalStateException();
         } else {
            this.class_(0, var1);
            this.class_(4, var2);
            this.catch_();
            return this;
         }
      } else {
         return this;
      }
   }

   static byte class_(float var0) {
      return (byte)((int)(rfU_2.class_(var0, -1.0F, 1.0F) * 127.0F) & 0xFF);
   }

   @Override
   default Ok_1 class_(int var1, int var2) {
      jv_3 var3 = this.case_();
      if (var3.break_() != jL_2.COLOR) {
         return this;
      } else if (var3.class_() != jF_2.UBYTE) {
         throw new IllegalStateException();
      } else {
         this.class_(0, (byte)ColorHelper.byte_(var1));
         this.class_(1, (byte)ColorHelper.protected_(var1));
         this.class_(2, (byte)ColorHelper.break_(var1));
         this.class_(3, (byte)var2);
         this.catch_();
         return this;
      }
   }

   default Ok_1 class_(short var1, short var2, int var3) {
      jv_3 var4 = this.case_();
      if (var4.break_() != jL_2.UV || var4.byte_() != var3) {
         return this;
      } else if (var4.class_() != jF_2.SHORT) {
         throw new IllegalStateException();
      } else {
         this.class_(0, var1);
         this.class_(2, var2);
         this.catch_();
         return this;
      }
   }

   @Override
   default Ok_1 class_(float var1, float var2, float var3) {
      jv_3 var4 = this.case_();
      if (var4.break_() != jL_2.NORMAL) {
         return this;
      } else if (var4.class_() != jF_2.BYTE) {
         throw new IllegalStateException();
      } else {
         this.class_(0, class_(var1));
         this.class_(1, class_(var2));
         this.class_(2, class_(var3));
         this.catch_();
         return this;
      }
   }

   void class_(int var1, byte var2);

   void class_(int var1, short var2);

   void class_(int var1, float var2);

   @Override
   default Ok_1 class_(double var1, double var3, double var5) {
      if (this.case_().class_() != jF_2.FLOAT) {
         throw new IllegalStateException();
      } else {
         this.class_(0, (float)var1);
         this.class_(4, (float)var3);
         this.class_(8, (float)var5);
         this.catch_();
         return this;
      }
   }

   @Override
   default Ok_1 class_(int var1) {
      jv_3 var2 = this.case_();
      if (var2.break_() != jL_2.COLOR) {
         return this;
      } else if (var2.class_() != jF_2.UBYTE) {
         throw new IllegalStateException();
      } else {
         this.class_(0, (byte)ColorHelper.byte_(var1));
         this.class_(1, (byte)ColorHelper.protected_(var1));
         this.class_(2, (byte)ColorHelper.break_(var1));
         this.class_(3, (byte)ColorHelper.throws_(var1));
         this.catch_();
         return this;
      }
   }

   @Override
   default Ok_1 break_(int var1, int var2, int var3, int var4) {
      jv_3 var5 = this.case_();
      if (var5.break_() != jL_2.COLOR) {
         return this;
      } else if (var5.class_() != jF_2.UBYTE) {
         throw new IllegalStateException();
      } else {
         this.class_(0, (byte)var1);
         this.class_(1, (byte)var2);
         this.class_(2, (byte)var3);
         this.class_(3, (byte)var4);
         this.catch_();
         return this;
      }
   }

   @Override
   default Ok_1 break_(int var1, int var2) {
      return this.class_((short)var1, (short)var2, 1);
   }

   void catch_();

   jv_3 case_();
}
