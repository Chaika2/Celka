package celestial;

import java.util.Random;

public class lo_3 implements rAn_1 {
   private final lY_2 class_;
   private final lT_2 break_;
   private final Hs_1 byte_;
   private final Random protected_ = new Random();
   private final yC_2 throws_;

   public lT_2 byte_() {
      return this.break_;
   }

   public lo_3(lY_2 var1, yC_2 var2) {
      this.class_ = var1;
      this.throws_ = var2;
      if (rrxr_3.x.byte_()) {
         this.break_ = (lT_2)rrxr_3.class_(rrxr_3.x, this.throws_);
      } else {
         this.break_ = new lT_2(this.throws_);
      }

      this.byte_ = new Hs_1();
   }

   public boolean class_(rfH_2 var1, rRp_1 var2, Ok_1 var3, rXE var4) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().h().else_()) {
         return false;
      } else {
         try {
            return this.byte_.class_(var2, var1, var3, var4);
         } catch (Throwable var8) {
            KY var6 = KY.class_(var8, "Tesselating liquid in world");
            Ko_1 var7 = var6.class_("Block being tesselated");
            Ko_1.class_(var7, var1, (xc_3)null);
            throw new KU(var6);
         }
      }
   }

   public IJ class_(xc_3 var1) {
      return this.class_.break_(var1);
   }

   public void class_(xc_3 var1, Ml_1 var2, Hx_1 var3, int var4, int var5) {
      this.class_(var1, var2, var3, var4, var5, rrGp_1.class_);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void class_(xc_3 var1, Ml_1 var2, Hx_1 var3, int var4, int var5, rrGq_1 var6) {
      xN_2 var7 = var1.private_();
      if (var7 != xN_2.INVISIBLE) {
         switch (var7) {
            case MODEL:
               IJ var8 = this.class_(var1);
               int var9 = this.throws_.class_(var1, (rRp_1)null, (rfH_2)null, 0);
               float var10 = (float)(var9 >> 16 & 0xFF) / 255.0F;
               float var11 = (float)(var9 >> 8 & 0xFF) / 255.0F;
               float var12 = (float)(var9 & 0xFF) / 255.0F;
               this.break_.class_(var2.byte_(), var3.getBuffer(yS_2.class_(var1, false)), var1, var8, var10, var11, var12, var4, var5, var6);
               break;
            case ENTITYBLOCK_ANIMATED:
               if (rrxr_3.Pb.byte_()) {
                  rdn_3 var13 = new rdn_3(var1.break_());
                  jG_2 var14 = (jG_2)rrxr_3.private_(var13.break_(), rrxr_3.Pb);
                  var14.class_(var13, IQ.NONE, var2, var3, var4, var5);
               } else {
                  jG_2.class_.class_(new rdn_3(var1.break_()), IQ.NONE, var2, var3, var4, var5);
               }
         }
      }
   }

   @Override
   public void class_(rAL var1) {
      this.byte_.class_();
   }

   public void class_(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5) {
      this.class_(var1, var2, var3, var4, var5, rrGp_1.class_);
   }

   public void class_(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5, rrGq_1 var6) {
      if (var1.private_() == xN_2.MODEL) {
         IJ var7 = this.class_.break_(var1);
         long var8 = var1.break_(var2);
         this.break_.class_(var3, var7, var1, var2, var4, var5, true, this.protected_, var8, fZ_2.class_, var6);
      }
   }

   public boolean class_(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5, boolean var6, Random var7) {
      return this.class_(var1, var2, var3, var4, var5, var6, var7, rrGp_1.class_);
   }

   public boolean class_(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5, boolean var6, Random var7, rrGq_1 var8) {
      try {
         xN_2 var9 = var1.private_();
         return var9 != xN_2.MODEL
            ? false
            : this.break_.class_(var3, this.class_(var1), var1, var2, var4, var5, var6, var7, var1.break_(var2), fZ_2.class_, var8);
      } catch (Throwable var12) {
         KY var10 = KY.class_(var12, "Tesselating block in world");
         Ko_1 var11 = var10.class_("Block being tesselated");
         Ko_1.class_(var11, var2, var1);
         throw new KU(var10);
      }
   }

   public lY_2 break_() {
      return this.class_;
   }

   public rrGK protected_() {
      return rrGD.MODELS;
   }
}
