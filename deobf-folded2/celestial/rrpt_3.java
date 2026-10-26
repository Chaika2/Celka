package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpt_3 extends rrpi_3 {
   public static Object[] id_class;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static short[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;
   public Object[] id_break;

   private rrpI_2 id_byte(int var1) {
      if (var1 == -1) {
         return (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.Gu)
            ? (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[2]
            : (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[0];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return (rdn_3)id_class[0];
   }

   public rrpt_3(HwHelper var1) {
      super(var1);
      this.id_break();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_break[0] = var6;
      Integer var7 = -1;
      this.id_break[2] = var7;
      rrmi_3 var8 = new rrmi_3();
      this.id_break[3] = var8;
      var1.id_class(new GroupSetting("Рюкзак", (rrIF)this.id_break[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_break();
      if (var1.id_break() == ((rrIF)this.id_break[0]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_break[1] = var6;
      }
   }

   @EventTarget
   public void id_class(rrFo_1 var1) {
      this.id_break();
      if (var1.id_break() instanceof Fc_1 var2 && var2.id_new().id_byte().contains("Рюкзак") && ((rrmi_3)this.id_break[3]).id_class()) {
         int var5 = ((rrmi_3)this.id_break[3]).id_break();
         int var4 = ((rrmi_3)this.id_break[3]).id_class(false, "backpack-inventory");
         if (var4 != -1) {
            ((Ax_1)id_import.id_class[55]).id_class(((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case, var5, var4, rXa_1.SWAP);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
         }

         ((rrmi_3)this.id_break[3]).id_throws();
      }
   }

   private int id_class(int var1) {
      this.id_break();
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
         if (!((rrmi_3)this.id_break[3]).id_class()) {
            rdn_3 var2 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var1);
            ((rrmi_3)this.id_break[3]).id_class(var2, var1);
         }

         ((Ax_1)id_import.id_class[55])
            .id_class(
               ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case,
               var1,
               ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected,
               rXa_1.SWAP
            );
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
         return var1;
      } else {
         return id_protected[11];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, 46, 89, 56, -128, 35, -79, 92}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3178665295994171469L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_break();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_break[1]) {
         HwHelper var2 = this.id_continue();
         int var3 = this.id_implements();
         rrpI_2 var4 = this.id_byte(var3);
         switch (((int[])rrpw_3.id_class[0])[var4.ordinal()]) {
            case 1:
               int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.Gu);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.id_class(var2, "рюкзака", var6);
               this.id_extends();
               return;
            case 2:
               this.id_extends();
               return;
            default:
               if (var4 == (rrpI_2)rrpI_2.staticFields9e44efdcc167316f82dd237e58019786[0]) {
                  if ((Integer)this.id_break[2] == -1) {
                     Integer var11 = this.id_class(var3);
                     this.id_break[2] = var11;
                  }

                  if ((Integer)this.id_break[2] > 8) {
                     if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)id_import.id_class[55])
                           .id_class(
                              ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case,
                              (Integer)this.id_break[2],
                              ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected,
                              rXa_1.SWAP
                           );
                        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLY.id_class());
                        this.id_extends();
                     }
                  } else {
                     this.id_extends();
                  }
               }
         }
      }
   }

   private void id_break() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         this.id_break[1] = false;
         this.id_break[2] = 0;
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1608242230;
   }

   @Override
   public rrIF id_throws() {
      this.id_break();
      return (rrIF)this.id_break[0];
   }

   private static void id_finally() {
      id_case = new short[]{
         0,
         0,
         2,
         3,
         0,
         0,
         1,
         0,
         1,
         0,
         57,
         0,
         2,
         2,
         2,
         0,
         55,
         57,
         4,
         2,
         57,
         1,
         0,
         3,
         3,
         3,
         55,
         57,
         4,
         0,
         3,
         3,
         1,
         2,
         1,
         57,
         2,
         0,
         57,
         1,
         3,
         57,
         1,
         3,
         55,
         57,
         4,
         57,
         1,
         0,
         0,
         0,
         57,
         57,
         57,
         1
      };
   }

   private void id_extends() {
      this.id_break();
      Boolean var5 = false;
      this.id_break[1] = var5;
      Integer var6 = -1;
      this.id_break[2] = var6;
   }

   private static void id_case() {
      id_catch = new boolean[]{true, false, true, false, true, false, false, false, true, false, true, false, false, true};
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
         for (int var2 = id_catch[7]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_protected[16];
      }
   }

   private static void id_package() {
      id_private = new String[]{new String("Активация"), new String("Рюкзак"), new String("рюкзака"), new String("Рюкзак"), new String("backpack-inventory")};
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> rrjk_3.id_throws(var0);
   }

   private static void id_private() {
      id_protected = new byte[]{-1, -1, 8, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 4, 2};
   }

   private static void id_final() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.Gu, 1)};
      id_class = var0;
   }

   private static void id_native() {
      id_byte = new float[]{20.0F};
   }

   @Override
   public boolean aK_() {
      this.id_break();
      this.id_extends();
      ((rrmi_3)this.id_break[3]).id_throws();
      return super.aK_();
   }
}
