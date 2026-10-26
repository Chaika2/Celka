package celestial;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class rOb_1 extends rbZ_2 implements iP_2 {
   private static final rut_3<Byte> id_super = rmE_2.id_class(rOb_1.class, ruw_3.id_class);
   private static final Map<rxL_2, rpL_2> id_this = rqR_2.id_class(Maps.newEnumMap(rxL_2.class), var0 -> {
      var0.put(rxL_2.WHITE, xu_3.rs);
      var0.put(rxL_2.ORANGE, xu_3.rE);
      var0.put(rxL_2.MAGENTA, xu_3.rG);
      var0.put(rxL_2.LIGHT_BLUE, xu_3.rb);
      var0.put(rxL_2.YELLOW, xu_3.rM);
      var0.put(rxL_2.LIME, xu_3.rO);
      var0.put(rxL_2.PINK, xu_3.rh);
      var0.put(rxL_2.GRAY, xu_3.rX);
      var0.put(rxL_2.LIGHT_GRAY, xu_3.rJ);
      var0.put(rxL_2.CYAN, xu_3.rx);
      var0.put(rxL_2.PURPLE, xu_3.rd);
      var0.put(rxL_2.BLUE, xu_3.rk);
      var0.put(rxL_2.BROWN, xu_3.rW);
      var0.put(rxL_2.GREEN, xu_3.rz);
      var0.put(rxL_2.RED, xu_3.rQ);
      var0.put(rxL_2.BLACK, xu_3.rN);
   });
   private static final Map<rxL_2, float[]> id_else = Maps.newEnumMap(
      Arrays.stream(rxL_2.values()).collect(Collectors.toMap(var0 -> (rxL_2)var0, rOb_1::id_byte))
   );
   private int id_synchronized;
   private rBb_1 id_return;

   private static float[] id_byte(rxL_2 var0) {
      if (var0 == rxL_2.WHITE) {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      } else {
         float[] var1 = var0.id_protected();
         float var2 = 0.75F;
         return new float[]{var1[0] * 0.75F, var1[1] * 0.75F, var1[2] * 0.75F};
      }
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Xe;
   }

   @Override
   protected void id_double() {
      this.id_synchronized = this.id_return.id_catch();
      super.id_double();
   }

   public rOb_1(aI_2<? extends rOb_1> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_this(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_super);
      if (var1) {
         ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(var2 | 16));
      } else {
         ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(var2 & -17));
      }
   }

   public rxL_2 n() {
      return rxL_2.id_class(((rmE_2)this.id_throws[49]).id_class(id_super) & 15);
   }

   public float id_interface(float var1) {
      if (this.id_synchronized > 4 && this.id_synchronized <= 36) {
         float var2 = ((float)(this.id_synchronized - 4) - var1) / 32.0F;
         return (float) (Math.PI / 5) + 0.2199115F * rfU_2.id_class(var2 * 28.7F);
      } else {
         return this.id_synchronized > 0 ? (float) (Math.PI / 5) : (Float)this.id_throws[16] * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public boolean id_class() {
      return this.BM() && !this.sJ() && !this.n_();
   }

   public static rxL_2 id_class(Random var0) {
      int var1 = var0.nextInt(100);
      if (var1 < 5) {
         return rxL_2.BLACK;
      } else if (var1 < 10) {
         return rxL_2.GRAY;
      } else if (var1 < 15) {
         return rxL_2.LIGHT_GRAY;
      } else if (var1 < 18) {
         return rxL_2.BROWN;
      } else {
         return var0.nextInt(500) == 0 ? rxL_2.PINK : rxL_2.WHITE;
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_break(id_class(var1.id_long()));
      return super.id_class(var1, var2, var3, var4, var5);
   }

   private rxL_2 id_class(rbZ_2 var1, rbZ_2 var2) {
      rxL_2 var3 = ((rOb_1)var1).n();
      rxL_2 var4 = ((rOb_1)var2).n();
      rXk_1 var5 = id_class(var3, var4);
      return ((rYB)this.id_throws[7])
         .id_implements()
         .id_class(rkj_3.id_class, var5, (rYB)this.id_throws[7])
         .map(var1x -> var1x.id_class(var5))
         .map(rdn_3::id_break)
         .filter(rxA_2.class::isInstance)
         .map(rxA_2.class::cast)
         .map(rxA_2::id_byte)
         .orElseGet(() -> ((rYB)this.id_throws[7]).id_int.nextBoolean() ? var3 : var4);
   }

   public static float[] id_class(rxL_2 var0) {
      return id_else.get(var0);
   }

   private static rXk_1 id_class(rxL_2 var0, rxL_2 var1) {
      rXk_1 var2 = new rXk_1(new rOM((rJP)null, -1), 2, 1);
      var2.id_break(0, new rdn_3(rxA_2.id_class(var0)));
      var2.id_break(1, new rdn_3(rxA_2.id_class(var1)));
      return var2;
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 10) {
         this.id_synchronized = 40;
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Sheared", this.sJ());
      var1.id_class("Color", (byte)this.n().id_break());
   }

   @Override
   public void id_class(rqL_2 var1) {
      ((rYB)this.id_throws[7]).id_class((rhd_3)null, this, rqn_3.Xa, var1, 1.0F, 1.0F);
      this.id_this(true);
      int var2 = 1 + ((Random)this.id_throws[40]).nextInt(3);

      for (int var3 = 0; var3 < var2; var3++) {
         rsE_2 var4 = this.id_class(id_this.get(this.n()), 1);
         if (var4 != null) {
            var4.id_byte(
               var4.rv()
                  .id_break(
                     (double)((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.1F),
                     (double)(((Random)this.id_throws[40]).nextFloat() * 0.05F),
                     (double)((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.1F)
                  )
            );
         }
      }
   }

   @Override
   public void id_default() {
      if (((rYB)this.id_throws[7]).id_continue) {
         this.id_synchronized = Math.max(0, this.id_synchronized - 1);
      }

      super.id_default();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public rqO_2 id_short() {
      if (this.sJ()) {
         return this.BC().id_finally();
      } else {
         switch (this.n()) {
            case WHITE:
            default:
               return rzl_3.id_transient;
            case ORANGE:
               return rzl_3.id_for;
            case MAGENTA:
               return rzl_3.id_double;
            case LIGHT_BLUE:
               return rzl_3.id_switch;
            case YELLOW:
               return rzl_3.r;
            case LIME:
               return rzl_3.P;
            case PINK:
               return rzl_3.B;
            case GRAY:
               return rzl_3.S;
            case LIGHT_GRAY:
               return rzl_3.s;
            case CYAN:
               return rzl_3.E;
            case PURPLE:
               return rzl_3.G;
            case BLUE:
               return rzl_3.b;
            case BROWN:
               return rzl_3.M;
            case GREEN:
               return rzl_3.O;
            case RED:
               return rzl_3.h;
            case BLACK:
               return rzl_3.X;
         }
      }
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.95F * var2.id_break;
   }

   public rOb_1 id_break(rrEm_1 var1, au_3 var2) {
      rOb_1 var3 = (rOb_1)var2;
      rOb_1 var4 = aI_2.Z.id_class(var1);
      var4.id_break(this.id_class(this, var3));
      return var4;
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (var3.id_break() == rdy_3.JJ) {
         if (!((rYB)this.id_throws[7]).id_continue && this.id_class()) {
            this.id_class(rqL_2.PLAYERS);
            var3.id_class(1, var1, var1x -> var1x.id_byte(var2));
            return ryZ_2.SUCCESS;
         } else {
            return ryZ_2.CONSUME;
         }
      } else {
         return super.id_break(var1, var2);
      }
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.Xi, 0.15F, 1.0F);
   }

   public void id_break(rxL_2 var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_super);
      ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)(var2 & 240 | var1.id_break() & 15));
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("Sheared"));
      this.id_break(rxL_2.id_class(var1.id_case("Color")));
   }

   public static iz_3 L() {
      return is_3.id_package().id_class(iQ_2.id_class, 8.0).id_class(iQ_2.id_protected, 0.23F);
   }

   @Override
   public void id_instanceof() {
      this.id_this(false);
      if (this.n_()) {
         this.d_(60);
      }
   }

   public float id_throw(float var1) {
      if (this.id_synchronized <= 0) {
         return 0.0F;
      } else if (this.id_synchronized >= 4 && this.id_synchronized <= 36) {
         return 1.0F;
      } else {
         return this.id_synchronized < 4 ? ((float)this.id_synchronized - var1) / 4.0F : -((float)(this.id_synchronized - 40) - var1) / 4.0F;
      }
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.XD;
   }

   @Override
   protected void id_final() {
      this.id_return = new rBb_1(this);
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rBY(this, 1.25));
      this.id_package.id_class(2, new rBP(this, 1.0));
      this.id_package.id_class(3, new rSO(this, 1.1, rkg_3.id_class(rdy_3.hB), false));
      this.id_package.id_class(4, new rBx_1(this, 1.1));
      this.id_package.id_class(5, this.id_return);
      this.id_package.id_class(6, new rSk_1(this, 1.0));
      this.id_package.id_class(7, new rBA(this, rhd_3.class, 6.0F));
      this.id_package.id_class(8, new rBC(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.XU;
   }

   public boolean sJ() {
      return (((rmE_2)this.id_throws[49]).id_class(id_super) & 16) != 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)0);
   }
}
