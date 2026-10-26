package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpM_2 extends rrpu_3 {
   private static long[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static float[] id_protected;
   private static byte[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_byte[34]]).id_break().id_class();
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -123914880;
   }

   public rrpM_2(FtHelper var1) {
      super(var1);
      this.id_native();
      rrIF var6 = new rrIF(id_private[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[0]]);
      this.id_class[id_byte[1]] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[id_byte[2]] = var7;
      Integer var8 = Integer.valueOf(id_case[0]);
      this.id_class[id_byte[3]] = var8;
      String var10003 = id_private[1];
      Setting[] var10004 = new Setting[id_catch[0]];
      var10004[id_catch[1]] = (rrIF)this.id_class[id_byte[4]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{43, -46, 126, 75, 82, -115, 71, -47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_native();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_byte[8]]) {
         ((rrfP_2)this.id_class[id_byte[9]]).id_class(rqR_2.id_break() - this.id_class[id_byte[10]] > id_break[0] ? id_catch[3] : id_catch[4]);
         if ((Boolean)this.id_class[id_byte[11]]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_implements();
            rrpO_2 var4 = this.id_break(var3);
            if (var4 == (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[id_byte[12]]) {
               int var5 = ((cb_3)id_import.id_class[id_byte[13]]).sK().id_protected(rdy_3.kk);
               float var6 = (float)var5 / id_protected[0];
               rrfu_3.id_class(var2, id_private[2], var6);
            } else if (var4 == (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[id_byte[14]]) {
               int var18 = this.id_class(var3);
               if (var18 > id_case[1]) {
                  Integer var11 = var18;
                  this.id_class[id_byte[15]] = var11;
                  Integer var12 = Integer.valueOf(id_catch[5]);
                  this.id_class[id_byte[16]] = var12;
               }
            }

            Boolean var13 = id_catch[6];
            this.id_class[id_byte[17]] = var13;
         }

         if ((Integer)this.id_class[id_byte[18]] != id_case[2]) {
            byte var17 = !((cb_3)id_import.id_class[id_byte[19]]).sV() && !((cb_3)id_import.id_class[id_byte[20]]).sZ() ? id_case[3] : id_catch[7];
            int var10002 = (Integer)this.id_class[id_byte[21]] + id_catch[8];
            Integer var14 = var10002;
            this.id_class[id_byte[22]] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[id_byte[23]]).id_class((Integer)this.id_class[id_byte[24]]);
               Integer var15 = Integer.valueOf(id_case[4]);
               this.id_class[id_byte[25]] = var15;
               Integer var16 = Integer.valueOf(id_catch[9]);
               this.id_class[id_byte[26]] = var16;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_native();
      ((rrfP_2)this.id_class[id_byte[7]]).id_class(var1);
   }

   private int id_class(int var1) {
      this.id_native();
      if (var1 == id_case[7]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_case[8]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_case[9]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_byte[36]]).id_implements[id_byte[37]]).id_protected);
         return var1;
      } else if (var1 >= id_case[10] && var1 <= id_case[11]) {
         ((rrfP_2)this.id_class[id_byte[38]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_byte[39]]).id_implements[id_byte[40]]).id_protected);
         ((Ax_1)id_import.id_class[id_byte[41]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[id_byte[42]] = var6;
         return var1;
      } else {
         return id_case[12];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1506210392266611535L;
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_native();
      if (var1.id_break() == ((rrIF)this.id_class[id_byte[5]]).id_finally().id_byte()) {
         Boolean var6 = id_catch[2];
         this.id_class[id_byte[6]] = var6;
      }
   }

   private rrpO_2 id_break(int var1) {
      if (var1 == id_case[6]) {
         return (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[id_byte[30]];
      } else {
         return ((cb_3)id_import.id_class[id_byte[31]]).sK().id_class(rdy_3.kk)
            ? (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[id_byte[32]]
            : (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[id_byte[33]];
      }
   }

   private static void id_break() {
      id_break = new long[]{300L, 0L};
   }

   @Override
   public rrIF id_throws() {
      this.id_native();
      return (rrIF)this.id_class[id_byte[35]];
   }

   private static void id_finally() {
      id_byte = new short[]{
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
         42,
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
         6
      };
   }

   private static void id_extends() {
      id_case = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   private static void id_case() {
      id_protected = new float[]{20.0F};
   }

   private int id_implements() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_case[13];
      } else if (var1.test(((cb_3)id_import.id_class[id_byte[43]]).ss())) {
         return id_case[14];
      } else if (var1.test(((cb_3)id_import.id_class[id_byte[44]]).Sn())) {
         return id_case[15];
      } else {
         for (int var2 = id_catch[12]; var2 < id_case[16]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_byte[45]]).id_implements[id_byte[46]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_case[17];
      }
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.kk) {
            return id_catch[13];
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase(id_private[3])) {
               return id_catch[14];
            } else {
               return rAB.id_class(var0, ((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_byte[47]]).id_class()) ? id_catch[15] : id_catch[16];
            }
         }
      };
   }

   private static void id_private() {
      id_catch = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   private static void id_final() {
      id_private = new String[]{new String("Активация"), new String("Снотворное"), new String("снотворного"), new String("[★] Снотворное")};
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[2] = false;
         this.id_class[3] = 0L;
         this.id_class[4] = 0;
         this.id_class[5] = 0;
      }
   }

   @Override
   public boolean aK_() {
      this.id_native();
      Boolean var5 = id_catch[10];
      this.id_class[id_byte[27]] = var5;
      Integer var6 = Integer.valueOf(id_case[5]);
      this.id_class[id_byte[28]] = var6;
      Integer var7 = Integer.valueOf(id_catch[11]);
      this.id_class[id_byte[29]] = var7;
      return super.aK_();
   }
}
