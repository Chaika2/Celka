package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryU extends rrpu_3 {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_case;
   private static float[] id_catch;
   private static String[] id_private;
   public static Object[] id_class;
   public Object[] id_break;
   private static long[] id_implements;

   private int id_byte(int var1) {
      this.id_implements();
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
         ((rrfP_2)this.id_break[2]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_break[4] = var6;
         return var1;
      } else {
         return id_byte[11];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[6]).id_break().id_class();
   }

   private static void id_int() {
      id_protected = new boolean[]{
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   public rryU(FtHelper var1) {
      super(var1);
      this.id_implements();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_break[0] = var6;
      rrIk_1 var7 = new rrIk_1("Только если есть плохие\nэффекты", true);
      this.id_break[1] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.id_break[2] = var8;
      Integer var9 = -1;
      this.id_break[5] = var9;
      var1.id_class(new GroupSetting("Божья аура", (rrIF)this.id_break[0], (rrIk_1)this.id_break[1]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_implements();
      if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_break[3] = var6;
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_implements();
      ((rrfP_2)this.id_break[2]).id_class(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -116, -27, 101, -117, 20, -9, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1066627591397802577L;
   }

   private rrye_1 id_class(int var1) {
      this.id_implements();
      if (var1 == -1) {
         return (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[1];
      } else if (((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.ko)) {
         return (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[2];
      } else {
         return ((rrIk_1)this.id_break[1]).id_class() && !this.id_case() && this.id_final()
            ? (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[3]
            : (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[0];
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_implements();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_break[2]).id_class(rqR_2.id_break() - this.id_break[4] > 300L ? true : id_protected[5]);
         if ((Boolean)this.id_break[3]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_break();
            rrye_1 var4 = this.id_class(var3);
            if (var4 == (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[2]) {
               int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.ko);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.id_class(var2, "божьей ауры", var6);
            } else if (var4 == (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[3]) {
               String var18 = rrfu_3.id_class((Module)var2);
               String var20 = "Нет плохих эффектов, божья аура не будет использована";
               rrfu_3.id_byte(var18 + var20);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).id_class(new rrtx_3(var2.id_final(), var20, 2000));
            } else if (var4 == (rrye_1)rrye_1.staticFields28f193d459cc3553a812ffe718ee6216[0]) {
               int var19 = this.id_byte(var3);
               if (var19 > 8) {
                  Integer var11 = var19;
                  this.id_break[5] = var11;
                  Integer var12 = 0;
                  this.id_break[6] = var12;
               }
            }

            Boolean var13 = false;
            this.id_break[3] = var13;
         }

         if ((Integer)this.id_break[5] != -1) {
            byte var17 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? id_byte[4] : id_protected[8];
            int var10002 = (Integer)this.id_break[6] + 1;
            Integer var14 = var10002;
            this.id_break[6] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_break[5]);
               Integer var15 = -1;
               this.id_break[5] = var15;
               Integer var16 = 0;
               this.id_break[6] = var16;
            }
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 587777957;
   }

   public int id_break() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_protected[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_byte[16];
      }
   }

   @Override
   public rrIF id_throws() {
      this.id_implements();
      return (rrIF)this.id_break[0];
   }

   private static void id_finally() {
      id_catch = new float[]{20.0F};
   }

   private static void id_extends() {
      Object[] var0 = new Object[]{
         List.of(
            (rLR)rLD.id_protected, (rLR)rLD.id_private, (rLR)rLD.id_break, (rLR)rLD.id_continue, (rLR)rLD.id_package, (rLR)rLD.id_goto, (rLR)rLD.id_instanceof
         )
      };
      id_class = var0;
   }

   private boolean id_case() {
      for (rLY var2 : ((cb_3)id_import.id_class[57]).So()) {
         if (((List)id_class[0]).contains(var2.id_class())) {
            return true;
         }
      }

      return id_protected[14];
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         this.id_break[3] = false;
         this.id_break[4] = 0L;
         this.id_break[5] = 0;
         this.id_break[6] = 0;
      }
   }

   private static void id_new() {
      id_implements = new long[]{300L, 0L};
   }

   private static void id_package() {
      id_private = new String[]{
         new String("Активация"),
         new String("Только если есть плохие\nэффекты"),
         new String("Божья аура"),
         new String("божьей ауры"),
         new String("Нет плохих эффектов, божья аура не будет использована"),
         new String("[★] Божья аура"),
         new String("godsaura"),
         new String("spooky-item")
      };
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.ko) {
            return false;
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase("[★] Божья аура")) {
               return true;
            } else {
               return !var0.id_protected("godsaura") && !var0.id_protected("spooky-item") ? id_protected[24] : id_protected[23];
            }
         }
      };
   }

   private static void id_private() {
      id_case = new short[]{
         0,
         0,
         1,
         2,
         5,
         0,
         1,
         0,
         3,
         2,
         0,
         2,
         4,
         3,
         2,
         57,
         3,
         0,
         2000,
         0,
         5,
         6,
         3,
         5,
         57,
         57,
         6,
         6,
         55,
         5,
         5,
         6,
         3,
         57,
         1,
         2,
         57,
         1,
         55,
         4,
         6,
         0,
         57,
         57,
         57,
         1,
         1,
         57,
         2,
         1,
         3,
         0,
         57,
         0,
         57
      };
   }

   private boolean id_final() {
      boolean var1 = false;
      boolean var2 = false;

      for (rLY var4 : ((cb_3)id_import.id_class[57]).So()) {
         rLR var5 = var4.id_class();
         if (var5 == rLD.id_throws) {
            var1 = true;
         } else if (var5 == rLD.id_class) {
            var2 = true;
         }

         if (var1 && var2) {
            return true;
         }
      }

      return id_protected[20];
   }

   private static void id_native() {
      id_byte = new byte[]{-1, 2, 8, -1, 2, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, -1, 7, 3, 4, 5, 6};
   }

   @Override
   public boolean aK_() {
      this.id_implements();
      Boolean var5 = false;
      this.id_break[3] = var5;
      return super.aK_();
   }
}
