package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpB_2 extends rrpu_3 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;
   private static long[] id_protected;
   private static float[] id_case;
   private static boolean[] id_catch;
   private static String[] id_private;

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_break[35]]).id_break().id_class();
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1403494826;
   }

   public rrpB_2(FtHelper var1) {
      super(var1);
      this.id_finally();
      rrIF var6 = new rrIF(id_private[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[0]]);
      this.id_class[id_break[1]] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[id_break[2]] = var7;
      Integer var8 = Integer.valueOf(id_byte[0]);
      this.id_class[id_break[3]] = var8;
      String var10003 = id_private[1];
      Setting[] var10004 = new Setting[id_catch[0]];
      var10004[id_catch[1]] = (rrIF)this.id_class[id_break[4]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_finally();
      ((rrfP_2)this.id_class[id_break[7]]).id_class(var1);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_finally();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[8]]) {
         ((rrfP_2)this.id_class[id_break[9]]).id_class(rqR_2.id_break() - this.id_class[id_break[10]] > id_protected[0] ? id_catch[3] : id_catch[4]);
         if ((Boolean)this.id_class[id_break[11]]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_private();
            rrpS_2 var4 = this.id_break(var3);
            if (var4 == (rrpS_2)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[12]]) {
               int var5 = ((cb_3)id_import.id_class[id_break[13]]).sK().id_protected(rdy_3.kk);
               float var6 = (float)var5 / id_case[0];
               rrfu_3.id_class(var2, id_private[2], var6);
            } else if (var4 == (rrpS_2)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[14]]) {
               int var18 = this.id_class(var3);
               if (var18 > id_byte[1]) {
                  Integer var11 = var18;
                  this.id_class[id_break[15]] = var11;
                  Integer var12 = Integer.valueOf(id_catch[5]);
                  this.id_class[id_break[16]] = var12;
               }
            }

            Boolean var13 = id_catch[6];
            this.id_class[id_break[17]] = var13;
         }

         if ((Integer)this.id_class[id_break[18]] != id_byte[2]) {
            byte var17 = !((cb_3)id_import.id_class[id_break[19]]).sV() && !((cb_3)id_import.id_class[id_break[20]]).sZ() ? id_byte[3] : id_catch[7];
            int var10002 = (Integer)this.id_class[id_break[21]] + id_catch[8];
            Integer var14 = var10002;
            this.id_class[id_break[22]] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[id_break[23]]).id_class((Integer)this.id_class[id_break[24]]);
               Integer var15 = Integer.valueOf(id_byte[4]);
               this.id_class[id_break[25]] = var15;
               Integer var16 = Integer.valueOf(id_catch[9]);
               this.id_class[id_break[26]] = var16;
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 38, -104, 49, 79, 112, -2, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_finally();
      if (var1.id_break() == ((rrIF)this.id_class[id_break[5]]).id_finally().id_byte()) {
         Boolean var6 = id_catch[2];
         this.id_class[id_break[6]] = var6;
      }
   }

   private int id_class(int var1) {
      this.id_finally();
      if (var1 == id_byte[7]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_byte[8]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_byte[9]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_break[36]]).id_implements[id_break[37]]).id_protected);
         return var1;
      } else if (var1 >= id_byte[10] && var1 <= id_byte[11]) {
         ((rrfP_2)this.id_class[id_break[38]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_break[39]]).id_implements[id_break[40]]).id_protected);
         ((Ax_1)id_import.id_class[id_break[41]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[id_break[42]] = var6;
         return var1;
      } else {
         return id_byte[12];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7699587479934803323L;
   }

   private rrpS_2 id_break(int var1) {
      if (var1 == id_byte[6]) {
         return (rrpS_2)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[30]];
      } else {
         return ((cb_3)id_import.id_class[id_break[31]]).sK().id_class(rdy_3.kk)
            ? (rrpS_2)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[32]]
            : (rrpS_2)rrpS_2.staticFieldsedb426333b473145b1f6515db5c3fcb9[id_break[33]];
      }
   }

   private static void id_break() {
      id_catch = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   @Override
   public rrIF id_throws() {
      this.id_finally();
      return (rrIF)this.id_class[id_break[34]];
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
      id_byte = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   private static void id_case() {
      id_protected = new long[]{300L, 0L};
   }

   private static void id_implements() {
      id_case = new float[]{20.0F};
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.kk) {
            return id_catch[13];
         } else if (var0.id_continue().id_byte().equalsIgnoreCase(id_private[3])) {
            return id_catch[14];
         } else {
            List var1 = Arrays.stream(((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[id_break[47]]).id_class())
               .map(rLY::id_class)
               .collect(Collectors.toList());
            return rAB.id_break(var0, var1) ? id_catch[15] : id_catch[16];
         }
      };
   }

   private int id_private() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_byte[13];
      } else if (var1.test(((cb_3)id_import.id_class[id_break[43]]).ss())) {
         return id_byte[14];
      } else if (var1.test(((cb_3)id_import.id_class[id_break[44]]).Sn())) {
         return id_byte[15];
      } else {
         for (int var2 = id_catch[12]; var2 < id_byte[16]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_break[45]]).id_implements[id_break[46]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_byte[17];
      }
   }

   private static void id_final() {
      id_break = new short[]{
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
         0,
         39,
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
         3
      };
   }

   private static void id_native() {
      id_private = new String[]{new String("Активация"), new String("Зелье палладина"), new String("зелья палладина"), new String("[★] Зелье Палладина")};
   }

   @Override
   public boolean aK_() {
      this.id_finally();
      Boolean var5 = id_catch[10];
      this.id_class[id_break[27]] = var5;
      Integer var6 = Integer.valueOf(id_byte[5]);
      this.id_class[id_break[28]] = var6;
      Integer var7 = Integer.valueOf(id_catch[11]);
      this.id_class[id_break[29]] = var7;
      return super.aK_();
   }
}
