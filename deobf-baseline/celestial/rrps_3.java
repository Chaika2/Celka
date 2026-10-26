package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrps_3 extends rrpu_3 {
   private static float[] id_break;
   private static long[] id_byte;
   private static byte[] id_protected;
   private static String[] id_case;
   private static short[] id_catch;
   public Object[] id_class;
   private static boolean[] id_private;

   private int id_byte(int var1) {
      this.id_implements();
      if (var1 == id_protected[7]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_protected[8]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_protected[9]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_catch[36]]).id_implements[id_catch[37]]).id_protected);
         return var1;
      } else if (var1 >= id_protected[10] && var1 <= id_protected[11]) {
         ((rrfP_2)this.id_class[id_catch[38]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_catch[39]]).id_implements[id_catch[40]]).id_protected);
         ((Ax_1)id_import.id_class[id_catch[41]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[id_catch[42]] = var6;
         return var1;
      } else {
         return id_protected[12];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_catch[34]]).id_break().id_class();
   }

   public rrps_3(FtHelper var1) {
      super(var1);
      this.id_implements();
      rrIF var6 = new rrIF(id_case[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_catch[0]]);
      this.id_class[id_catch[1]] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[id_catch[2]] = var7;
      Integer var8 = Integer.valueOf(id_protected[0]);
      this.id_class[id_catch[3]] = var8;
      String var10003 = id_case[1];
      Setting[] var10004 = new Setting[id_private[0]];
      var10004[id_private[1]] = (rrIF)this.id_class[id_catch[4]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, 110, 6, -39, 92, 27, -56, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_implements();
      if (var1.id_break() == ((rrIF)this.id_class[id_catch[5]]).id_finally().id_byte()) {
         Boolean var6 = id_private[2];
         this.id_class[id_catch[6]] = var6;
      }
   }

   private rrpE_2 id_class(int var1) {
      if (var1 == id_protected[6]) {
         return (rrpE_2)rrpE_2.staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[id_catch[30]];
      } else {
         return ((cb_3)id_import.id_class[id_catch[31]]).sK().id_class(rdy_3.kk)
            ? (rrpE_2)rrpE_2.staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[id_catch[32]]
            : (rrpE_2)rrpE_2.staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[id_catch[33]];
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_implements();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[8]]) {
         ((rrfP_2)this.id_class[id_catch[9]]).id_class(rqR_2.id_break() - this.id_class[id_catch[10]] > id_byte[0] ? id_private[3] : id_private[4]);
         if ((Boolean)this.id_class[id_catch[11]]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_case();
            rrpE_2 var4 = this.id_class(var3);
            if (var4 == (rrpE_2)rrpE_2.staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[id_catch[12]]) {
               int var5 = ((cb_3)id_import.id_class[id_catch[13]]).sK().id_protected(rdy_3.kk);
               float var6 = (float)var5 / id_break[0];
               rrfu_3.id_class(var2, id_case[2], var6);
            } else if (var4 == (rrpE_2)rrpE_2.staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[id_catch[14]]) {
               int var18 = this.id_byte(var3);
               if (var18 > id_protected[1]) {
                  Integer var11 = var18;
                  this.id_class[id_catch[15]] = var11;
                  Integer var12 = Integer.valueOf(id_private[5]);
                  this.id_class[id_catch[16]] = var12;
               }
            }

            Boolean var13 = id_private[6];
            this.id_class[id_catch[17]] = var13;
         }

         if ((Integer)this.id_class[id_catch[18]] != id_protected[2]) {
            byte var17 = !((cb_3)id_import.id_class[id_catch[19]]).sV() && !((cb_3)id_import.id_class[id_catch[20]]).sZ() ? id_protected[3] : id_private[7];
            int var10002 = (Integer)this.id_class[id_catch[21]] + id_private[8];
            Integer var14 = var10002;
            this.id_class[id_catch[22]] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[id_catch[23]]).id_class((Integer)this.id_class[id_catch[24]]);
               Integer var15 = Integer.valueOf(id_protected[4]);
               this.id_class[id_catch[25]] = var15;
               Integer var16 = Integer.valueOf(id_private[9]);
               this.id_class[id_catch[26]] = var16;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_implements();
      ((rrfP_2)this.id_class[id_catch[7]]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7848936643693190167L;
   }

   private static void id_break() {
      id_byte = new long[]{300L, 0L};
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -186674965;
   }

   @Override
   public rrIF id_throws() {
      this.id_implements();
      return (rrIF)this.id_class[id_catch[35]];
   }

   private static void id_finally() {
      id_catch = new short[]{
         0,
         0,
         1,
         4,
         0,
         0,
         2,
         1,
         0,
         1,
         3,
         2,
         2,
         57,
         0,
         4,
         5,
         2,
         4,
         57,
         57,
         5,
         5,
         55,
         4,
         4,
         5,
         2,
         4,
         5,
         1,
         57,
         2,
         0,
         41,
         0,
         57,
         1,
         1,
         57,
         1,
         55,
         3,
         57,
         57,
         57,
         1,
         5
      };
   }

   private static void id_extends() {
      id_protected = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   private int id_case() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_protected[13];
      } else if (var1.test(((cb_3)id_import.id_class[id_catch[43]]).ss())) {
         return id_protected[14];
      } else if (var1.test(((cb_3)id_import.id_class[id_catch[44]]).Sn())) {
         return id_protected[15];
      } else {
         for (int var2 = id_private[12]; var2 < id_protected[16]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_catch[45]]).id_implements[id_catch[46]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_protected[17];
      }
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[2] = false;
         this.id_class[3] = 0L;
         this.id_class[4] = 0;
         this.id_class[5] = 0;
      }
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.kk) {
            return id_private[13];
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase(id_case[3])) {
               return id_private[14];
            } else {
               return rAB.id_class(var0, ((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_catch[47]]).id_class())
                  ? id_private[15]
                  : id_private[16];
            }
         }
      };
   }

   private static void id_private() {
      id_case = new String[]{new String("Активация"), new String("Зелье радиации"), new String("зелья радиации"), new String("[★] Зелье Радиации")};
   }

   private static void id_final() {
      id_break = new float[]{20.0F};
   }

   private static void id_native() {
      id_private = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      Boolean var5 = id_private[10];
      this.id_class[id_catch[27]] = var5;
      Integer var6 = Integer.valueOf(id_protected[5]);
      this.id_class[id_catch[28]] = var6;
      Integer var7 = Integer.valueOf(id_private[11]);
      this.id_class[id_catch[29]] = var7;
      return super.aK_();
   }
}
