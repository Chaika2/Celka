package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpU_2 extends rrpi_3 {
   private static float[] id_byte;
   private static String[] id_protected;
   private static short[] id_case;
   private static byte[] id_catch;
   private static boolean[] id_private;
   public Object[] id_class;
   public static Object[] id_break;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 55571599;
   }

   @Override
   public rdn_3 id_byte() {
      return (rdn_3)id_break[0];
   }

   public rrpU_2(HwHelper var1) {
      super(var1);
      this.id_package();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_class[0] = var6;
      Integer var7 = -1;
      this.id_class[2] = var7;
      var1.id_class(new GroupSetting("Стан", (rrIF)this.id_class[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_package();
      if (var1.id_break() == ((rrIF)this.id_class[0]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_class[1] = var6;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2079707073842102010L;
   }

   private int id_class(int var1) {
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
         return id_catch[10];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 30, 78, -10, -81, -102, -32, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_package();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.id_class[1]) {
         HwHelper var2 = this.id_continue();
         int var3 = this.id_break();
         rrpa_3 var4 = this.id_break(var3);
         switch (((int[])rrpe_3.id_class[0])[var4.ordinal()]) {
            case 1:
               int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.dQ);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.id_class(var2, "стана", var6);
               this.id_extends();
               return;
            case 2:
               this.id_extends();
               return;
            default:
               if (var4 == (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[0]) {
                  if ((Integer)this.id_class[2] == -1) {
                     Integer var11 = this.id_class(var3);
                     this.id_class[2] = var11;
                  }

                  if ((Integer)this.id_class[2] > 8) {
                     if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().P().id_super()) {
                        rrfo_3.id_class(rpm_3.MAIN_HAND);
                        ((Ax_1)id_import.id_class[55])
                           .id_class(
                              ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case,
                              (Integer)this.id_class[2],
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

   private int id_break() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_private[4]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_catch[15];
      }
   }

   private rrpa_3 id_break(int var1) {
      if (var1 == -1) {
         return (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.dQ)
            ? (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[2]
            : (rrpa_3)rrpa_3.staticFields056fc31e671730e3aeb58e324ad8a234[0];
      }
   }

   @Override
   public rrIF id_throws() {
      this.id_package();
      return (rrIF)this.id_class[0];
   }

   private static void id_finally() {
      id_byte = new float[]{20.0F};
   }

   private void id_extends() {
      this.id_package();
      Boolean var5 = false;
      this.id_class[1] = var5;
      Integer var6 = -1;
      this.id_class[2] = var6;
   }

   private static void id_case() {
      id_case = new short[]{
         0, 0, 2, 0, 0, 1, 0, 1, 0, 57, 0, 2, 2, 2, 0, 55, 57, 4, 2, 57, 1, 0, 1, 2, 1, 57, 2, 0, 57, 1, 55, 57, 4, 57, 1, 0, 0, 0, 57, 57, 57, 1
      };
   }

   private static void id_implements() {
      id_protected = new String[]{new String("Активация"), new String("Стан"), new String("стана")};
   }

   private void id_package() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[1] = false;
         this.id_class[2] = 0;
      }
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> rrjk_3.id_protected(var0);
   }

   private static void id_private() {
      id_catch = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 3, 2};
   }

   private static void id_final() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.dQ, 1)};
      id_break = var0;
   }

   private static void id_native() {
      id_private = new boolean[]{true, false, true, false, false, true, false, true, false, false, true};
   }

   @Override
   public boolean aK_() {
      this.id_extends();
      return super.aK_();
   }
}
