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
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[42]).id_break().id_class();
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -123914880;
   }

   public rrpM_2(FtHelper var1) {
      super(var1);
      this.id_native();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_class[0] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[1] = var7;
      Integer var8 = -1;
      this.id_class[4] = var8;
      var1.id_class(new GroupSetting("Снотворное", (rrIF)this.id_class[0]));
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
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_class[1]).id_class(rqR_2.id_break() - this.id_class[3] > 300L ? true : id_catch[4]);
         if ((Boolean)this.id_class[2]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_implements();
            rrpO_2 var4 = this.id_break(var3);
            if (var4 == (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[2]) {
               int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.kk);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.id_class(var2, "снотворного", var6);
            } else if (var4 == (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[0]) {
               int var18 = this.id_class(var3);
               if (var18 > 8) {
                  Integer var11 = var18;
                  this.id_class[4] = var11;
                  Integer var12 = 0;
                  this.id_class[5] = var12;
               }
            }

            Boolean var13 = false;
            this.id_class[2] = var13;
         }

         if ((Integer)this.id_class[4] != -1) {
            byte var17 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? id_case[3] : id_catch[7];
            int var10002 = (Integer)this.id_class[5] + 1;
            Integer var14 = var10002;
            this.id_class[5] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_class[4]);
               Integer var15 = -1;
               this.id_class[4] = var15;
               Integer var16 = 0;
               this.id_class[5] = var16;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_native();
      ((rrfP_2)this.id_class[1]).id_class(var1);
   }

   private int id_class(int var1) {
      this.id_native();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_class[1]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[3] = var6;
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
      if (var1.id_break() == ((rrIF)this.id_class[0]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_class[2] = var6;
      }
   }

   private rrpO_2 id_break(int var1) {
      if (var1 == -1) {
         return (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.kk)
            ? (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[2]
            : (rrpO_2)rrpO_2.staticFields4014939632583c5ba36d4475b7d8caf4[0];
      }
   }

   private static void id_break() {
      id_break = new long[]{300L, 0L};
   }

   @Override
   public rrIF id_throws() {
      this.id_native();
      return (rrIF)this.id_class[0];
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
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_catch[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
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
            return false;
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase("[★] Снотворное")) {
               return true;
            } else {
               return rAB.id_class(var0, ((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[6]).id_class()) ? true : id_catch[16];
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
      Boolean var5 = false;
      this.id_class[2] = var5;
      Integer var6 = -1;
      this.id_class[4] = var6;
      Integer var7 = 0;
      this.id_class[5] = var7;
      return super.aK_();
   }
}
