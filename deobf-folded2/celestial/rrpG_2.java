package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpG_2 extends rrpu_3 {
   private static byte[] id_break;
   private static long[] id_byte;
   private static short[] id_protected;
   private static float[] id_case;
   public Object[] id_class;
   private static String[] id_catch;
   private static boolean[] id_private;

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[38]).id_break().id_class();
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -81504416;
   }

   public rrpG_2(FtHelper var1) {
      super(var1);
      this.id_finally();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_class[0] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[1] = var7;
      Integer var8 = -1;
      this.id_class[4] = var8;
      var1.id_class(new GroupSetting("Зелье гнева", (rrIF)this.id_class[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_finally();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_class[1]).id_class(rqR_2.id_break() - this.id_class[3] > 300L ? true : id_private[4]);
         if ((Boolean)this.id_class[2]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_native();
            rrpb_3 var4 = this.id_break(var3);
            if (var4 == (rrpb_3)rrpb_3.staticFields91a494c78a8435468eb612e156e4cedc[2]) {
               int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.kk);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.id_class(var2, "зелья гнева", var6);
            } else if (var4 == (rrpb_3)rrpb_3.staticFields91a494c78a8435468eb612e156e4cedc[0]) {
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
            byte var17 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? id_break[3] : id_private[7];
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
   public void id_class(rrLB var1) {
      this.id_finally();
      if (var1.id_break() == ((rrIF)this.id_class[0]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_class[2] = var6;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1747991136280696522L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, -27, 21, 77, 34, 104, 72, -117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private int id_class(int var1) {
      this.id_finally();
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
         return id_break[12];
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_finally();
      ((rrfP_2)this.id_class[1]).id_class(var1);
   }

   private static void id_break() {
      id_case = new float[]{20.0F};
   }

   private rrpb_3 id_break(int var1) {
      if (var1 == -1) {
         return (rrpb_3)rrpb_3.staticFields91a494c78a8435468eb612e156e4cedc[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.kk)
            ? (rrpb_3)rrpb_3.staticFields91a494c78a8435468eb612e156e4cedc[2]
            : (rrpb_3)rrpb_3.staticFields91a494c78a8435468eb612e156e4cedc[0];
      }
   }

   @Override
   public rrIF id_throws() {
      this.id_finally();
      return (rrIF)this.id_class[0];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[2] = false;
         this.id_class[3] = 0L;
         this.id_class[4] = 0;
         this.id_class[5] = 0;
      }
   }

   private static void id_extends() {
      id_break = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   private static void id_case() {
      id_byte = new long[]{300L, 0L};
   }

   private static void id_implements() {
      id_catch = new String[]{new String("Активация"), new String("Зелье гнева"), new String("зелья гнева"), new String("[★] Зелье Гнева")};
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.kk) {
            return false;
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase("[★] Зелье Гнева")) {
               return true;
            } else {
               List var2 = Arrays.stream(((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[2]).id_class())
                  .map(rLY::id_class)
                  .collect(Collectors.toList());
               return rAB.id_break(var0, var2) ? true : id_private[16];
            }
         }
      };
   }

   private static void id_private() {
      id_protected = new short[]{
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
         38,
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
         2
      };
   }

   private static void id_final() {
      id_private = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   private int id_native() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_private[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_break[17];
      }
   }

   @Override
   public boolean aK_() {
      this.id_finally();
      Boolean var5 = false;
      this.id_class[2] = var5;
      Integer var6 = -1;
      this.id_class[4] = var6;
      Integer var7 = 0;
      this.id_class[5] = var7;
      return super.aK_();
   }
}
