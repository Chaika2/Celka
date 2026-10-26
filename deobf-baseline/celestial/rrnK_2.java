package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public abstract class rrnK_2 extends rrTF<AttackAura> {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public static Object[] id_class;
   public Object[] id_break;
   private static float[] id_case;
   private static short[] id_catch;
   private static double[] id_private;

   public abstract float id_byte();

   public abstract float id_int();

   public rrnK_2(AttackAura var1, rrTT var2) {
      super(var1);
      this.id_goto();
      this.id_break[id_catch[0]] = var2;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new double[]{180.0, Math.PI, 90.0, 180.0, Math.PI, Double.MAX_VALUE, 8.0, 12.0, 0.0, 0.0};
   }

   public void id_class(boolean var1) {
      this.id_goto();
      Boolean var6 = var1;
      this.id_break[id_catch[18]] = var6;
   }

   public void id_class(AttackAura var1, iB_2 var2, rrnD_2 var3) {
      if (var2 != null && rmD_2.id_break && var1.id_float()) {
         if (var3.id_case() && var3.id_class(var1, id_case[0], id_protected[0], id_byte[0], id_byte[1], id_byte[2])) {
            ((cb_3)id_import.id_class[id_catch[11]]).c_(id_byte[3]);
            Integer var8 = Integer.valueOf(id_byte[4]);
            var3.id_break[id_catch[12]] = var8;
         }
      }
   }

   public List<rrTA> id_class(an_3 var1, rfl_3 var2) {
      ArrayList var3 = new ArrayList();
      rjU_2 var4 = ((cb_3)id_import.id_class[id_catch[15]]).id_new(id_case[2]);
      float var5 = id_case[3];
      float var6 = id_case[4];
      float var7 = id_case[5];
      double var8 = var2.id_class + (double)var5;
      double var10 = var2.id_protected - (double)var5;
      double var12 = var2.id_byte + (double)var5;
      double var14 = var2.id_case - (double)var5;
      double var16 = var10 - var8;
      double var18 = var16 / id_private[6];
      double var20 = (var2.id_throws - var2.id_break) / id_private[7];
      float var22 = this.id_continue().id_try();

      for (double var23 = var2.id_break; var23 < var2.id_throws; var23 += var20) {
         if (!(var23 < var1.re() + (double)var7) && !(var23 > var2.id_throws - (double)var6)) {
            for (double var25 = id_private[8]; var25 < var16; var25 += var18) {
               rrTn_1 var27 = new rrTn_1(new rjU_2(var8, var23, var12 + var25));
               var3.add(var27);
               rrTn_1 var28 = new rrTn_1(new rjU_2(var10, var23, var12 + var25));
               var3.add(var28);
               rrTn_1 var29 = new rrTn_1(new rjU_2(var8 + var25, var23, var12));
               var3.add(var29);
               rrTn_1 var30 = new rrTn_1(new rjU_2(var8 + var25, var23, var14));
               var3.add(var30);
            }

            rrTn_1 var32 = new rrTn_1(new rjU_2(var10, var23, var14));
            var3.add(var32);
         }
      }

      ArrayList var31 = new ArrayList();
      boolean var24 = this.id_native();
      boolean var33 = var24 && !var3.stream().anyMatch(var3x -> var3x.id_class(var4, var1, var1xx -> !this.id_class(var1xx) ? id_byte[13] : id_byte[14]))
         ? id_byte[9]
         : id_byte[8];

      for (rrTA var34 : var3) {
         rjU_2 var35 = var34.rr();
         if (!var24 || var34.id_class(var4, var1, var1x -> !this.id_class(var1x) ? id_byte[11] : id_byte[12]) || !var33) {
            rfo_3 var36 = rhj_3.id_class((cb_3)id_import.id_class[id_catch[16]], var1, var4, var35, (double)var22);
            if (var36 != null) {
               var31.add(var34);
            }
         }
      }

      return var31.isEmpty() ? var3 : var31;
   }

   public void id_class(iB_2 var1) {
      this.id_goto();
      this.id_continue().id_long().id_class(var1, (rrTT)this.id_break[id_catch[3]]);
   }

   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[1]]) {
         AttackAura var2 = this.id_continue();
         this.id_class(var2, var2.id_continue(), var2.id_long());
      }
   }

   public boolean id_class(xc_3 var1) {
      return id_byte[5];
   }

   public void id_class(rrTj_1 var1, rrTI var2) {
      this.id_goto();
      if (this.id_continue().B()) {
         ((rrTT)this.id_break[id_catch[2]]).id_class(var1, var2);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{80, -91, 77, 17, 77, -123, 126, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public double id_class(rrTA var1, List<rrTA> var2, PX var3, PX var4) {
      double var5 = id_private[9];
      var5 += PJ.id_break(var3.id_throws(), var4.id_throws());
      return var5 + PJ.id_class(var3.id_protected(), var4.id_protected());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6105436487107228796L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -249422440;
   }

   public float id_class(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.id_break - var1.id_break;
      double var5 = var2.id_protected - var1.id_protected;
      return (float)(Math.atan2(var5, var3) * id_private[0] / id_private[1] - id_private[2]);
   }

   public Pair<rrTA, rrTA> id_class(an_3 var1, PX var2) {
      ((List)rrTT.id_break[id_catch[13]]).clear();
      List var3 = this.id_class(var1, var1.rN());
      ((List)rrTT.id_break[id_catch[14]]).addAll(var3);
      Object var4 = new rrTn_1(var1.id_new(id_case[1]));
      PX var5 = var2.id_byte();
      double var6 = id_private[5];

      for (rrTA var9 : var3) {
         PX var10 = PJ.id_class(var9);
         double var11 = this.id_class(var9, var3, var5, var10);
         if (var11 < var6) {
            var6 = var11;
            var4 = var9;
         }
      }

      return Pair.of(var4, var4);
   }

   public void id_class() {
      this.id_goto();
      ((rrTT)this.id_break[id_catch[9]]).id_final();
   }

   public boolean id_class(PX var1) {
      return id_byte[6];
   }

   public float id_break(rjU_2 var1, rjU_2 var2) {
      double var3 = var2.id_break - var1.id_break;
      double var5 = var2.id_byte - var1.id_byte;
      double var7 = var2.id_protected - var1.id_protected;
      return (float)(-Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7)) * id_private[3] / id_private[4]);
   }

   public boolean id_break(PX var1) {
      return id_byte[7];
   }

   public boolean id_break() {
      this.id_goto();
      return (Boolean)this.id_break[id_catch[17]];
   }

   public void id_throws() {
   }

   public rrTH id_finally() {
      return (var0, var1, var2) -> {
         float var3 = rfU_2.id_catch(var1 - var0);
         if (var3 > var2) {
            return var0 + var2;
         } else {
            return var3 < -var2 ? var0 - var2 : var1;
         }
      };
   }

   public rrTI id_extends() {
      this.id_goto();
      return ((rrTT)this.id_break[id_catch[4]]).id_implements();
   }

   private void id_goto() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         this.id_break[1] = false;
      }
   }

   public rrTq_1 id_case() {
      return null;
   }

   private static void id_else() {
      id_protected = new byte[]{50, 2};
   }

   public rrTC id_implements() {
      this.id_goto();
      return ((rrTT)this.id_break[id_catch[10]]).id_protected();
   }

   public PX id_new() {
      this.id_goto();
      return new PX(((rrTT)this.id_break[id_catch[6]]).id_private(), ((rrTT)this.id_break[id_catch[7]]).id_super());
   }

   public rrTH id_package() {
      return this.id_finally();
   }

   private static void id_return() {
      id_case = new float[]{2.0F, 1.0F, 1.0F, 0.08F, 0.0F, 0.0F};
   }

   private static void id_while() {
      id_catch = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 57, 6, 1, 1, 57, 57, 1, 1};
   }

   private static void id_public() {
      Object[] var0 = new Object[]{new Random()};
      id_class = var0;
   }

   public abstract rrTf_1 id_protected();

   public PX id_private() {
      this.id_goto();
      return ((rrTT)this.id_break[id_catch[5]]).id_byte();
   }

   public rrTj_1 id_final() {
      return null;
   }

   public void id_volatile() {
      this.id_goto();
      ((rrTT)this.id_break[id_catch[8]]).id_finally();
   }

   private static void id_synchronized() {
      id_byte = new boolean[]{false, false, true, false, true, false, true, true, true, false, true, true, false, true, false, false, true, false, true};
   }

   public boolean id_native() {
      return id_byte[10];
   }

   @Override
   public boolean aK_() {
      this.id_class();
      return super.aK_();
   }
}
