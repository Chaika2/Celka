package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryw_1 extends rrpu_3 {
   private static long[] id_break;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_case;
   private static short[] id_catch;
   private static String[] id_private;
   public Object[] id_class;

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[40]).id_break().id_class();
   }

   private int id_byte(int var1) {
      this.id_extends();
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
         return -1;
      }
   }

   public rryw_1(FtHelper var1) {
      super(var1);
      this.id_extends();
      rrIF var6 = new rrIF(id_private[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_catch[0]]);
      this.id_class[id_catch[1]] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[1] = var7;
      Integer var8 = -1;
      this.id_class[4] = var8;
      String var10003 = id_private[1];
      Setting[] var10004 = new Setting[1];
      var10004[id_byte[1]] = (rrIF)this.id_class[id_catch[4]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-17, -1, 45, -74, 31, 60, -63, 15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rryI id_class(int var1) {
      if (var1 == -1) {
         return (rryI)rryI.staticFields0877fde0314d38ca87da6306c28c77a3[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.kk)
            ? (rryI)rryI.staticFields0877fde0314d38ca87da6306c28c77a3[2]
            : (rryI)rryI.staticFields0877fde0314d38ca87da6306c28c77a3[id_catch[33]];
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_extends();
      if (var1.id_break() == ((rrIF)this.id_class[id_catch[5]]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_class[2] = var6;
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_extends();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[8]]) {
         ((rrfP_2)this.id_class[1]).id_class(rqR_2.id_break() - this.id_class[3] > 300L ? true : id_byte[4]);
         if ((Boolean)this.id_class[2]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_final();
            rryI var4 = this.id_class(var3);
            if (var4 == (rryI)rryI.staticFields0877fde0314d38ca87da6306c28c77a3[2]) {
               int var5 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.kk);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.id_class(var2, id_private[2], var6);
            } else if (var4 == (rryI)rryI.staticFields0877fde0314d38ca87da6306c28c77a3[id_catch[14]]) {
               int var18 = this.id_byte(var3);
               if (var18 > 8) {
                  Integer var11 = var18;
                  this.id_class[4] = var11;
                  Integer var12 = Integer.valueOf(id_byte[5]);
                  this.id_class[5] = var12;
               }
            }

            Boolean var13 = id_byte[6];
            this.id_class[2] = var13;
         }

         if ((Integer)this.id_class[4] != -1) {
            byte var17 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? 2 : id_byte[7];
            int var10002 = (Integer)this.id_class[5] + 1;
            Integer var14 = var10002;
            this.id_class[5] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_class[4]);
               Integer var15 = -1;
               this.id_class[4] = var15;
               Integer var16 = Integer.valueOf(id_byte[9]);
               this.id_class[5] = var16;
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_extends();
      ((rrfP_2)this.id_class[1]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8767308439194621401L;
   }

   private static void id_break() {
      id_private = new String[]{new String("Активация"), new String("Зелье ассасина"), new String("зелья ассасина"), new String("[★] Зелье Ассасина")};
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1550375132;
   }

   @Override
   public rrIF id_throws() {
      this.id_extends();
      return (rrIF)this.id_class[id_catch[35]];
   }

   private static void id_finally() {
      id_case = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[2] = false;
         this.id_class[3] = 0L;
         this.id_class[4] = 0;
         this.id_class[5] = 0;
      }
   }

   private static void id_case() {
      id_byte = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   private static void id_implements() {
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
         40,
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
         4
      };
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.kk) {
            return id_byte[13];
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase(id_private[3])) {
               return true;
            } else {
               List var2 = Arrays.stream(((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[4]).id_class())
                  .map(rLY::id_class)
                  .collect(Collectors.toList());
               return rAB.id_break(var0, var2) ? true : id_byte[16];
            }
         }
      };
   }

   private static void id_private() {
      id_protected = new float[]{20.0F};
   }

   private int id_final() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_byte[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return -1;
      }
   }

   private static void id_native() {
      id_break = new long[]{300L, 0L};
   }

   @Override
   public boolean aK_() {
      this.id_extends();
      Boolean var5 = id_byte[10];
      this.id_class[2] = var5;
      Integer var6 = -1;
      this.id_class[4] = var6;
      Integer var7 = Integer.valueOf(id_byte[11]);
      this.id_class[5] = var7;
      return super.aK_();
   }
}
