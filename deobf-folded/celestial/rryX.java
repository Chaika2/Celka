package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryX extends rrTF<AntiAfk> {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static double[] id_case;
   private static byte[] id_catch;

   private static void id_byte() {
      id_protected = new float[]{Float.NaN, 0.5F, -0.5F, 1.0F, -0.3F, 0.3F, 0.2F, 15000.0F, 1000.0F, 5000.0F, 0.0F};
   }

   public rryX(AntiAfk var1) {
      super(var1);
      this.id_implements();
      rrfw_3 var6 = new rrfw_3();
      this.id_class[id_break[0]] = var6;
      Float var7 = Float.NaN;
      this.id_class[2] = var7;
      Boolean var8 = true;
      this.id_class[4] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7436306544589015464L;
   }

   public float id_class() {
      this.id_implements();

      float var1;
      do {
         var1 = 1.0F + rrfQ_2.id_byte(-0.3F, 0.3F);
      } while (Math.abs(var1 - (Float)this.id_class[2]) < 0.2F);

      Float var6 = var1;
      this.id_class[2] = var6;
      return var1;
   }

   @EventTarget
   public void id_class(rrAO var1) {
      this.id_implements();
      int var10002 = (Integer)this.id_class[3] - 1;
      Integer var6 = var10002;
      this.id_class[3] = var6;
      if (var10002 > 0) {
         var1.id_break(this.id_class[4] ? 0.5F : -0.5F);
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, -51, 56, 0, 96, -58, 28, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_implements();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[3]]) {
         if ((rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               && (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
            || this.id_break()) {
            ((rrfw_3)this.id_class[id_break[8]]).id_class();
            Integer var11 = Integer.valueOf(id_byte[1]);
            this.id_class[3] = var11;
            Boolean var12 = true;
            this.id_class[4] = var12;
            return;
         }

         if (rrfj_3.id_catch()) {
            ((rrfw_3)this.id_class[id_break[11]]).id_class();
            return;
         }

         if (rrfZ_2.id_byte()) {
            ((rrfw_3)this.id_class[id_break[12]]).id_class();
            Integer var13 = Integer.valueOf(id_byte[3]);
            this.id_class[3] = var13;
            Boolean var14 = true;
            this.id_class[4] = var14;
            return;
         }

         if ((Double)this.id_class[1] == id_case[0]) {
            Double var15 = (double)this.id_private();
            this.id_class[1] = var15;
         }

         if (((rrfw_3)this.id_class[id_break[17]]).id_class((Double)this.id_class[1])) {
            if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]) {
               Integer var16 = 30;
               this.id_class[3] = var16;
               Boolean var17 = !this.id_class[4] ? true : id_byte[6];
               this.id_class[4] = var17;
            } else {
               float var2 = this.id_class();
               float var3 = ((Random)rrfQ_2.id_class[id_break[24]]).nextBoolean() ? var2 : -var2;
               cb_3 var10000 = (cb_3)id_import.id_class[57];
               Float var18 = (Float)((cb_3)id_import.id_class[57]).id_throws[15] + var3;
               var10000.id_throws[15] = var18;
               if (PJ.id_class(((cb_3)id_import.id_class[57]).z(), (double)((Ax_1)id_import.id_class[55]).id_byte(), id_byte[7]) instanceof rff_3 var5) {
                  ryZ_2 var6 = ((Ax_1)id_import.id_class[55]).id_break((cb_3)id_import.id_class[57], (gm_3)id_import.id_class[56], rpm_3.OFF_HAND, var5);
                  if (var6 == ryZ_2.SUCCESS) {
                     ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_break[34]]).id_class(new rmq_3(rpm_3.OFF_HAND));
                  }
               }
            }

            Double var19 = (double)this.id_private();
            this.id_class[1] = var19;
            ((rrfw_3)this.id_class[id_break[36]]).id_class();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2073151410;
   }

   private boolean id_break() {
      return !((Qw_1)id_import.id_class[20]).h.id_protected()
            && !((Qw_1)id_import.id_class[20]).J.id_protected()
            && !((Qw_1)id_import.id_class[20]).X.id_protected()
            && !((Qw_1)id_import.id_class[20]).x.id_protected()
         ? id_byte[12]
         : true;
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, true, false, true, true, false, false, true, false, true, true, false, true, false, false};
   }

   private static void id_finally() {
      id_break = new short[]{
         0,
         2,
         4,
         0,
         1,
         2,
         1,
         4,
         0,
         3,
         4,
         0,
         0,
         3,
         4,
         1,
         1,
         0,
         1,
         1,
         4,
         3,
         4,
         4,
         0,
         57,
         15,
         15,
         57,
         55,
         55,
         57,
         56,
         57,
         0,
         1,
         0,
         3,
         3,
         4,
         0,
         1,
         3,
         4,
         2,
         2,
         20,
         20,
         20,
         20
      };
   }

   private static void id_case() {
      id_catch = new byte[]{30, 5, 2, 3, 4};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         this.id_class[1] = 0.0;
         this.id_class[2] = 0.0F;
         this.id_class[3] = 0;
         this.id_class[4] = false;
      }
   }

   private static void id_protected() {
      id_case = new double[3];
   }

   private float id_private() {
      return 15000.0F + rrfQ_2.id_byte(1000.0F, 5000.0F);
   }

   @Override
   public boolean aI_() {
      this.id_implements();
      ((rrfw_3)this.id_class[id_break[40]]).id_class();
      Double var5 = id_case[1];
      this.id_class[1] = var5;
      Integer var6 = Integer.valueOf(id_byte[9]);
      this.id_class[3] = var6;
      Boolean var7 = true;
      this.id_class[4] = var7;
      return super.aI_();
   }
}
