package celestial;

import java.util.Random;

public class lo_3 implements rAn_1 {
   private final lY_2 id_class;
   private final lT_2 id_break;
   private final Hs_1 id_byte;
   private final Random id_protected = new Random();
   private final yC_2 id_throws;

   public lT_2 id_byte() {
      return this.id_break;
   }

   public lo_3(lY_2 var1, yC_2 var2) {
      this.id_class = var1;
      this.id_throws = var2;
      if (rrxr_3.x.id_byte()) {
         this.id_break = (lT_2)rrxr_3.id_class(rrxr_3.x, this.id_throws);
      } else {
         this.id_break = new lT_2(this.id_throws);
      }

      this.id_byte = new Hs_1();
   }

   public boolean id_class(rfH_2 var1, rRp_1 var2, Ok_1 var3, rXE var4) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().h().id_else()) {
         return false;
      } else {
         try {
            return this.id_byte.id_class(var2, var1, var3, var4);
         } catch (Throwable var8) {
            KY var6 = KY.id_class(var8, "Tesselating liquid in world");
            Ko_1 var7 = var6.id_class("Block being tesselated");
            Ko_1.id_class(var7, var1, (xc_3)null);
            throw new KU(var6);
         }
      }
   }

   public IJ id_class(xc_3 var1) {
      return this.id_class.id_break(var1);
   }

   public void id_class(xc_3 var1, Ml_1 var2, Hx_1 var3, int var4, int var5) {
      this.id_class(var1, var2, var3, var4, var5, rrGp_1.id_class);
   }

   public void id_class(xc_3 var1, Ml_1 var2, Hx_1 var3, int var4, int var5, rrGq_1 var6) {
      xN_2 var7 = var1.id_private();
      if (var7 != xN_2.INVISIBLE) {
         switch (var7) {
            case MODEL:
               IJ var8 = this.id_class(var1);
               int var9 = this.id_throws.id_class(var1, (rRp_1)null, (rfH_2)null, 0);
               float var10 = (float)(var9 >> 16 & 0xFF) / 255.0F;
               float var11 = (float)(var9 >> 8 & 0xFF) / 255.0F;
               float var12 = (float)(var9 & 0xFF) / 255.0F;
               this.id_break.id_class(var2.id_byte(), var3.getBuffer(yS_2.id_class(var1, false)), var1, var8, var10, var11, var12, var4, var5, var6);
               break;
            case ENTITYBLOCK_ANIMATED:
               if (rrxr_3.Pb.id_byte()) {
                  rdn_3 var13 = new rdn_3(var1.id_break());
                  jG_2 var14 = (jG_2)rrxr_3.id_private(var13.id_break(), rrxr_3.Pb);
                  var14.id_class(var13, IQ.NONE, var2, var3, var4, var5);
               } else {
                  jG_2.id_class.id_class(new rdn_3(var1.id_break()), IQ.NONE, var2, var3, var4, var5);
               }
         }
      }
   }

   @Override
   public void id_class(rAL var1) {
      this.id_byte.id_class();
   }

   public void id_class(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5) {
      this.id_class(var1, var2, var3, var4, var5, rrGp_1.id_class);
   }

   public void id_class(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5, rrGq_1 var6) {
      if (var1.id_private() == xN_2.MODEL) {
         IJ var7 = this.id_class.id_break(var1);
         long var8 = var1.id_break(var2);
         this.id_break.id_class(var3, var7, var1, var2, var4, var5, true, this.id_protected, var8, fZ_2.id_class, var6);
      }
   }

   public boolean id_class(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5, boolean var6, Random var7) {
      return this.id_class(var1, var2, var3, var4, var5, var6, var7, rrGp_1.id_class);
   }

   public boolean id_class(xc_3 var1, rfH_2 var2, rRp_1 var3, Ml_1 var4, Ok_1 var5, boolean var6, Random var7, rrGq_1 var8) {
      try {
         xN_2 var9 = var1.id_private();
         return var9 != xN_2.MODEL
            ? false
            : this.id_break.id_class(var3, this.id_class(var1), var1, var2, var4, var5, var6, var7, var1.id_break(var2), fZ_2.id_class, var8);
      } catch (Throwable var12) {
         KY var10 = KY.id_class(var12, "Tesselating block in world");
         Ko_1 var11 = var10.id_class("Block being tesselated");
         Ko_1.id_class(var11, var2, var1);
         throw new KU(var10);
      }
   }

   public lY_2 id_break() {
      return this.id_class;
   }

   public rrGK id_protected() {
      return rrGD.MODELS;
   }
}
