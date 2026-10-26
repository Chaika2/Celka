package celestial;

class rGM extends rPY {
   private float id_finally;

   public rGM(rGB var1, is_3 var2) {
      super(var2);
      this.id_implements = var1;
      this.id_finally = 0.1F;
   }

   @Override
   public void id_class() {
      if ((Boolean)this.id_implements.id_throws[23]) {
         rGB var10000 = this.id_implements;
         Float var27 = (Float)this.id_implements.id_throws[15] + 180.0F;
         var10000.id_throws[15] = var27;
         this.id_finally = 0.1F;
      }

      float var1 = (float)(this.id_implements.id_break.id_break - this.id_implements.rx());
      float var2 = (float)(this.id_implements.id_break.id_byte - this.id_implements.re());
      float var3 = (float)(this.id_implements.id_break.id_protected - this.id_implements.BO());
      double var4 = (double)rfU_2.id_byte(var1 * var1 + var3 * var3);
      double var6 = 1.0 - (double)rfU_2.id_throws(var2 * 0.7F) / var4;
      var1 = (float)((double)var1 * var6);
      var3 = (float)((double)var3 * var6);
      var4 = (double)rfU_2.id_byte(var1 * var1 + var3 * var3);
      double var8 = (double)rfU_2.id_byte(var1 * var1 + var3 * var3 + var2 * var2);
      float var10 = (Float)this.id_implements.id_throws[15];
      float var11 = (float)rfU_2.id_protected((double)var3, (double)var1);
      float var12 = rfU_2.id_catch((Float)this.id_implements.id_throws[15] + 90.0F);
      float var13 = rfU_2.id_catch(var11 * (180.0F / (float)Math.PI));
      rGB var34 = this.id_implements;
      Float var28 = rfU_2.id_protected(var12, var13, 4.0F) - 90.0F;
      var34.id_throws[15] = var28;
      var34 = this.id_implements;
      Float var29 = (Float)this.id_implements.id_throws[15];
      var34.id_private[23] = var29;
      if (rfU_2.id_protected(var10, (Float)this.id_implements.id_throws[15]) < 3.0F) {
         this.id_finally = rfU_2.id_byte(this.id_finally, 1.8F, 0.005F * (1.8F / this.id_finally));
      } else {
         this.id_finally = rfU_2.id_byte(this.id_finally, 0.2F, 0.025F);
      }

      float var14 = (float)(-(rfU_2.id_protected((double)(-var2), var4) * 180.0F / (float)Math.PI));
      var34 = this.id_implements;
      Float var30 = var14;
      var34.id_throws[16] = var30;
      float var15 = (Float)this.id_implements.id_throws[15] + 90.0F;
      double var16 = (double)(this.id_finally * rfU_2.id_break(var15 * (float) (Math.PI / 180.0))) * Math.abs((double)var1 / var8);
      double var18 = (double)(this.id_finally * rfU_2.id_class(var15 * (float) (Math.PI / 180.0))) * Math.abs((double)var3 / var8);
      double var20 = (double)(this.id_finally * rfU_2.id_class(var14 * (float) (Math.PI / 180.0))) * Math.abs((double)var2 / var8);
      rjU_2 var22 = this.id_implements.rv();
      this.id_implements.id_byte(var22.id_throws(new rjU_2(var16, var20, var18).id_protected(var22).id_class(0.2)));
   }
}
