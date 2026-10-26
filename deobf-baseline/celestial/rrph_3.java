package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrph_3 extends rrpu_3 implements rrnF_2 {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static long[] id_protected;
   private static String[] id_case;
   private static float[] id_catch;
   public Object[] id_class;
   private static byte[] id_private;

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_break[51]]).id_break().id_class();
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -607669236;
   }

   private static void id_int() {
      id_byte = new boolean[]{
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   public rrph_3(FtHelper var1) {
      super(var1);
      this.id_goto();
      rrIF var6 = new rrIF(id_case[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_break[0]]);
      this.id_class[id_break[1]] = var6;
      rrTT var7 = new rrTT(this);
      this.id_class[id_break[2]] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.id_class[id_break[3]] = var8;
      Integer var9 = Integer.valueOf(id_private[0]);
      this.id_class[id_break[4]] = var9;
      String var10003 = id_case[1];
      Setting[] var10004 = new Setting[id_byte[0]];
      var10004[id_byte[1]] = (rrIF)this.id_class[id_break[5]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new long[]{300L, 0L};
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_goto();
      if (var1.id_break() == ((rrIF)this.id_class[id_break[6]]).id_finally().id_byte()) {
         Boolean var6 = id_byte[2];
         this.id_class[id_break[7]] = var6;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8866007168812045352L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, -52, 17, 120, -79, -110, -104, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_goto();
      ((rrfP_2)this.id_class[id_break[8]]).id_class(var1);
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[9]]) {
         ((rrfP_2)this.id_class[id_break[10]]).id_class(rqR_2.id_break() - this.id_class[id_break[11]] > id_protected[0] ? id_byte[3] : id_byte[4]);
         if ((Boolean)this.id_class[id_break[12]]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_package();
            int var4 = this.id_final();
            rrpJ_2 var5 = this.id_break(var3);
            switch (((int[])rrpX_2.id_class[id_break[13]])[var5.ordinal()]) {
               case 1:
                  int var23 = ((cb_3)id_import.id_class[id_break[14]]).sK().id_protected(rdy_3.Jd);
                  float var7 = (float)var23 / id_catch[0];
                  rrfu_3.id_class(var2, id_case[2], var7);
                  Boolean var12 = id_byte[5];
                  this.id_class[id_break[15]] = var12;
                  return;
               case 2:
                  Boolean var13 = id_byte[6];
                  this.id_class[id_break[16]] = var13;
                  return;
            }

            label50:
            if (var5 == (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[id_break[17]]) {
               if (var4 > 0) {
                  ((rrTT)this.id_class[id_break[18]])
                     .id_class(
                        (rrTg_1)() -> new PX(
                              (Float)((cb_3)id_import.id_class[id_break[60]]).id_break[id_break[61]],
                              (Float)((cb_3)id_import.id_class[id_break[62]]).id_break[id_break[63]]
                           ),
                        (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_break[19]]
                     );
               }

               if (var4 != 0) {
                  int var10002 = (Integer)this.id_class[id_break[20]] + id_byte[7];
                  Integer var14 = var10002;
                  this.id_class[id_break[21]] = var14;
                  if (var10002 < var4) {
                     break label50;
                  }
               }

               int var6 = this.id_class(var3);
               if (var6 > id_private[1]) {
                  Integer var15 = var6;
                  this.id_class[id_break[22]] = var15;
                  Integer var16 = Integer.valueOf(id_byte[8]);
                  this.id_class[id_break[23]] = var16;
               }

               if (var4 != 0) {
                  ((rrTT)this.id_class[id_break[24]]).id_final();
                  ((rrTT)this.id_class[id_break[25]]).id_finally();
               }

               Integer var17 = Integer.valueOf(id_byte[9]);
               this.id_class[id_break[26]] = var17;
               Boolean var18 = id_byte[10];
               this.id_class[id_break[27]] = var18;
            }
         }

         if ((Integer)this.id_class[id_break[28]] != id_private[2]) {
            byte var22 = !((cb_3)id_import.id_class[id_break[29]]).sV() && !((cb_3)id_import.id_class[id_break[30]]).sZ() ? id_private[3] : id_byte[11];
            int var24 = (Integer)this.id_class[id_break[31]] + id_byte[12];
            Integer var19 = var24;
            this.id_class[id_break[32]] = var19;
            if (var24 > var22) {
               ((Ax_1)id_import.id_class[id_break[33]]).id_class((Integer)this.id_class[id_break[34]]);
               Integer var20 = Integer.valueOf(id_private[4]);
               this.id_class[id_break[35]] = var20;
               Integer var21 = Integer.valueOf(id_byte[13]);
               this.id_class[id_break[36]] = var21;
            }
         }
      }
   }

   private int id_class(int var1) {
      this.id_goto();
      if (var1 == id_private[7]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_private[8]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_private[9]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_break[44]]).id_implements[id_break[45]]).id_protected);
         return var1;
      } else if (var1 >= id_private[10] && var1 <= id_private[11]) {
         ((rrfP_2)this.id_class[id_break[46]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_break[47]]).id_implements[id_break[48]]).id_protected);
         ((Ax_1)id_import.id_class[id_break[49]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[id_break[50]] = var6;
         return var1;
      } else {
         return id_private[12];
      }
   }

   @Override
   public float id_break() {
      return id_catch[1];
   }

   private rrpJ_2 id_break(int var1) {
      if (var1 == id_private[6]) {
         return (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[id_break[40]];
      } else {
         return ((cb_3)id_import.id_class[id_break[41]]).sK().id_class(rdy_3.Jd)
            ? (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[id_break[42]]
            : (rrpJ_2)rrpJ_2.staticFields5c082363986d3091901b81d145e82889[id_break[43]];
      }
   }

   @Override
   public rrIF id_throws() {
      this.id_goto();
      return (rrIF)this.id_class[id_break[52]];
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_break[59]];
   }

   private void id_goto() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         this.id_class[3] = false;
         this.id_class[4] = 0L;
         this.id_class[5] = 0;
         this.id_class[6] = 0;
         this.id_class[7] = 0;
      }
   }

   private static void id_else() {
      id_catch = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static void id_new() {
      id_case = new String[]{
         new String("Активация"),
         new String("Пласт"),
         new String("пласта"),
         new String("[★] Пласт"),
         new String("[★] Новогодний пласт"),
         new String("stratum"),
         new String("christmasstratum"),
         new String("spooky-item")
      };
   }

   private int id_package() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_private[14];
      } else if (var1.test(((cb_3)id_import.id_class[id_break[55]]).ss())) {
         return id_private[15];
      } else if (var1.test(((cb_3)id_import.id_class[id_break[56]]).Sn())) {
         return id_private[16];
      } else {
         for (int var2 = id_byte[17]; var2 < id_private[17]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_break[57]]).id_implements[id_break[58]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_private[18];
      }
   }

   private static void id_public() {
      id_private = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, 2, -1, -2, -3, 45, -1, 8, 3, 4, 5, 6, 7};
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.Jd) {
            return id_byte[18];
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase(id_case[3]) || var1.equalsIgnoreCase(id_case[4])) {
               return id_byte[19];
            } else {
               return !var0.id_protected(id_case[5]) && !var0.id_protected(id_case[6]) && !var0.id_protected(id_case[7]) ? id_byte[21] : id_byte[20];
            }
         }
      };
   }

   @Override
   public float id_private() {
      return id_catch[2];
   }

   private int id_final() {
      return (C_volatile)rrTT.id_break[id_break[53]] instanceof rrTT && ((C_volatile)rrTT.id_break[id_break[54]]).id_byte() != null
         ? id_private[13]
         : id_byte[16];
   }

   private static void id_synchronized() {
      id_break = new short[]{
         0,
         0,
         1,
         2,
         6,
         0,
         0,
         3,
         2,
         0,
         2,
         4,
         3,
         0,
         57,
         3,
         3,
         0,
         1,
         0,
         5,
         5,
         6,
         7,
         1,
         1,
         5,
         3,
         6,
         57,
         57,
         7,
         7,
         55,
         6,
         6,
         7,
         3,
         6,
         7,
         1,
         57,
         2,
         0,
         57,
         1,
         2,
         57,
         1,
         55,
         4,
         4,
         0,
         3,
         3,
         57,
         57,
         57,
         1,
         3,
         57,
         45,
         57,
         46
      };
   }

   @Override
   public boolean aK_() {
      this.id_goto();
      Boolean var5 = id_byte[14];
      this.id_class[id_break[37]] = var5;
      Integer var6 = Integer.valueOf(id_private[5]);
      this.id_class[id_break[38]] = var6;
      Integer var7 = Integer.valueOf(id_byte[15]);
      this.id_class[id_break[39]] = var7;
      return super.aK_();
   }
}
