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
      Float var7 = id_protected[0];
      this.id_class[id_break[1]] = var7;
      Boolean var8 = id_byte[0];
      this.id_class[id_break[2]] = var8;
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
         var1 = id_protected[3] + rrfQ_2.id_byte(id_protected[4], id_protected[5]);
      } while (Math.abs(var1 - (Float)this.id_class[id_break[44]]) < id_protected[6]);

      Float var6 = var1;
      this.id_class[id_break[45]] = var6;
      return var1;
   }

   @EventTarget
   public void id_class(rrAO var1) {
      this.id_implements();
      int var10002 = (Integer)this.id_class[id_break[37]] - id_byte[8];
      Integer var6 = var10002;
      this.id_class[id_break[38]] = var6;
      if (var10002 > 0) {
         var1.id_break(this.id_class[id_break[39]] ? id_protected[1] : id_protected[2]);
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
         if ((rrfq_3)rrfp_3.id_class[id_break[4]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[5]]
               && (rrfq_3)rrfp_3.id_class[id_break[6]] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[7]]
            || this.id_break()) {
            ((rrfw_3)this.id_class[id_break[8]]).id_class();
            Integer var11 = Integer.valueOf(id_byte[1]);
            this.id_class[id_break[9]] = var11;
            Boolean var12 = id_byte[2];
            this.id_class[id_break[10]] = var12;
            return;
         }

         if (rrfj_3.id_catch()) {
            ((rrfw_3)this.id_class[id_break[11]]).id_class();
            return;
         }

         if (rrfZ_2.id_byte()) {
            ((rrfw_3)this.id_class[id_break[12]]).id_class();
            Integer var13 = Integer.valueOf(id_byte[3]);
            this.id_class[id_break[13]] = var13;
            Boolean var14 = id_byte[4];
            this.id_class[id_break[14]] = var14;
            return;
         }

         if ((Double)this.id_class[id_break[15]] == id_case[0]) {
            Double var15 = (double)this.id_private();
            this.id_class[id_break[16]] = var15;
         }

         if (((rrfw_3)this.id_class[id_break[17]]).id_class((Double)this.id_class[id_break[18]])) {
            if ((rrfq_3)rrfp_3.id_class[id_break[19]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[20]]) {
               Integer var16 = Integer.valueOf(id_catch[0]);
               this.id_class[id_break[21]] = var16;
               Boolean var17 = !this.id_class[id_break[22]] ? id_byte[5] : id_byte[6];
               this.id_class[id_break[23]] = var17;
            } else {
               float var2 = this.id_class();
               float var3 = ((Random)rrfQ_2.id_class[id_break[24]]).nextBoolean() ? var2 : -var2;
               cb_3 var10000 = (cb_3)id_import.id_class[id_break[25]];
               Float var18 = (Float)((cb_3)id_import.id_class[id_break[25]]).id_throws[id_break[26]] + var3;
               var10000.id_throws[id_break[27]] = var18;
               if (PJ.id_class(((cb_3)id_import.id_class[id_break[28]]).z(), (double)((Ax_1)id_import.id_class[id_break[29]]).id_byte(), id_byte[7]) instanceof rff_3 var5
                  )
                {
                  ryZ_2 var6 = ((Ax_1)id_import.id_class[id_break[30]])
                     .id_break((cb_3)id_import.id_class[id_break[31]], (gm_3)id_import.id_class[id_break[32]], rpm_3.OFF_HAND, var5);
                  if (var6 == ryZ_2.SUCCESS) {
                     ((Aq_1)((cb_3)id_import.id_class[id_break[33]]).id_break[id_break[34]]).id_class(new rmq_3(rpm_3.OFF_HAND));
                  }
               }
            }

            Double var19 = (double)this.id_private();
            this.id_class[id_break[35]] = var19;
            ((rrfw_3)this.id_class[id_break[36]]).id_class();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2073151410;
   }

   private boolean id_break() {
      return !((Qw_1)id_import.id_class[id_break[46]]).h.id_protected()
            && !((Qw_1)id_import.id_class[id_break[47]]).J.id_protected()
            && !((Qw_1)id_import.id_class[id_break[48]]).X.id_protected()
            && !((Qw_1)id_import.id_class[id_break[49]]).x.id_protected()
         ? id_byte[12]
         : id_byte[11];
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
      return id_protected[7] + rrfQ_2.id_byte(id_protected[8], id_protected[9]);
   }

   @Override
   public boolean aI_() {
      this.id_implements();
      ((rrfw_3)this.id_class[id_break[40]]).id_class();
      Double var5 = id_case[1];
      this.id_class[id_break[41]] = var5;
      Integer var6 = Integer.valueOf(id_byte[9]);
      this.id_class[id_break[42]] = var6;
      Boolean var7 = id_byte[10];
      this.id_class[id_break[43]] = var7;
      return super.aI_();
   }
}
