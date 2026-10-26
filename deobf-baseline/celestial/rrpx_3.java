package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpx_3 extends rrpu_3 {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   private static byte[] id_case;
   private static long[] id_catch;
   private static float[] id_private;
   public Object[] id_class;

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[id_protected[41]]).id_break().id_class();
   }

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -329871552;
   }

   public rrpx_3(FtHelper var1) {
      super(var1);
      this.id_finally();
      rrIF var6 = new rrIF(id_break[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_protected[0]]);
      this.id_class[id_protected[1]] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_class[id_protected[2]] = var7;
      Integer var8 = Integer.valueOf(id_case[0]);
      this.id_class[id_protected[3]] = var8;
      String var10003 = id_break[1];
      Setting[] var10004 = new Setting[id_byte[0]];
      var10004[id_byte[1]] = (rrIF)this.id_class[id_protected[4]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_finally();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[8]]) {
         ((rrfP_2)this.id_class[id_protected[9]]).id_class(rqR_2.id_break() - this.id_class[id_protected[10]] > id_catch[0] ? id_byte[3] : id_byte[4]);
         if ((Boolean)this.id_class[id_protected[11]]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_extends();
            rrpd_3 var4 = this.id_break(var3);
            if (var4 == (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[12]]) {
               int var5 = ((cb_3)id_import.id_class[id_protected[13]]).sK().id_protected(rdy_3.OW);
               float var6 = (float)var5 / id_private[0];
               rrfu_3.id_class(var2, id_break[2], var6);
            } else if (var4 == (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[14]]) {
               int var18 = this.id_class(var3);
               if (var18 > id_case[1]) {
                  Integer var11 = var18;
                  this.id_class[id_protected[15]] = var11;
                  Integer var12 = Integer.valueOf(id_byte[5]);
                  this.id_class[id_protected[16]] = var12;
               }
            }

            Boolean var13 = id_byte[6];
            this.id_class[id_protected[17]] = var13;
         }

         if ((Integer)this.id_class[id_protected[18]] != id_case[2]) {
            byte var17 = !((cb_3)id_import.id_class[id_protected[19]]).sV() && !((cb_3)id_import.id_class[id_protected[20]]).sZ() ? id_case[3] : id_byte[7];
            int var10002 = (Integer)this.id_class[id_protected[21]] + id_byte[8];
            Integer var14 = var10002;
            this.id_class[id_protected[22]] = var14;
            if (var10002 > var17) {
               ((Ax_1)id_import.id_class[id_protected[23]]).id_class((Integer)this.id_class[id_protected[24]]);
               Integer var15 = Integer.valueOf(id_case[4]);
               this.id_class[id_protected[25]] = var15;
               Integer var16 = Integer.valueOf(id_byte[9]);
               this.id_class[id_protected[26]] = var16;
            }
         }
      }
   }

   private void id_class(rpm_3 var1) {
      boolean var2 = ((cb_3)id_import.id_class[id_protected[47]]).id_boolean();
      if (var2) {
         ((Aq_1)((cb_3)id_import.id_class[id_protected[48]]).id_break[id_protected[49]])
            .id_break(new rmD_2((cb_3)id_import.id_class[id_protected[50]], rmU_2.RELEASE_SHIFT_KEY));
      }

      rrfo_3.id_class(var1);
      if (var2) {
         ((Aq_1)((cb_3)id_import.id_class[id_protected[51]]).id_break[id_protected[52]])
            .id_break(new rmD_2((cb_3)id_import.id_class[id_protected[53]], rmU_2.PRESS_SHIFT_KEY));
      }
   }

   private int id_class(int var1) {
      this.id_finally();
      if (var1 == id_case[7]) {
         this.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_case[8]) {
         this.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_case[9]) {
         rrfo_3.id_class(var1);
         this.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_protected[34]]).id_implements[id_protected[35]]).id_protected);
         return var1;
      } else if (var1 >= id_case[10] && var1 <= id_case[11]) {
         ((rrfP_2)this.id_class[id_protected[36]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_protected[37]]).id_implements[id_protected[38]]).id_protected);
         ((Ax_1)id_import.id_class[id_protected[39]]).id_class(var1);
         this.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[id_protected[40]] = var6;
         return var1;
      } else {
         return id_case[12];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3348930223001861781L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{42, 20, 116, -54, -88, -4, -98, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_finally();
      if (var1.id_break() == ((rrIF)this.id_class[id_protected[5]]).id_finally().id_byte()) {
         Boolean var6 = id_byte[2];
         this.id_class[id_protected[6]] = var6;
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_finally();
      ((rrfP_2)this.id_class[id_protected[7]]).id_class(var1);
   }

   private rrpd_3 id_break(int var1) {
      if (var1 == id_case[6]) {
         return (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[30]];
      } else {
         return ((cb_3)id_import.id_class[id_protected[31]]).sK().id_class(rdy_3.OW)
            ? (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[32]]
            : (rrpd_3)rrpd_3.staticFieldsf0e458d392b335c78064d20a36d4b573[id_protected[33]];
      }
   }

   private static void id_break() {
      id_case = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   @Override
   public rrIF id_throws() {
      this.id_finally();
      return (rrIF)this.id_class[id_protected[42]];
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

   private int id_extends() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_case[13];
      } else if (var1.test(((cb_3)id_import.id_class[id_protected[43]]).ss())) {
         return id_case[14];
      } else if (var1.test(((cb_3)id_import.id_class[id_protected[44]]).Sn())) {
         return id_case[15];
      } else {
         for (int var2 = id_byte[12]; var2 < id_case[16]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_protected[45]]).id_implements[id_protected[46]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_case[17];
      }
   }

   private static void id_case() {
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
         57,
         1,
         1,
         57,
         1,
         55,
         3,
         5,
         0,
         57,
         57,
         57,
         1,
         57,
         57,
         0,
         57,
         57,
         0,
         57
      };
   }

   private static void id_implements() {
      id_byte = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.OW) {
            return id_byte[13];
         } else {
            String var1 = var0.id_continue().id_byte();
            if (var1.equalsIgnoreCase(id_break[3]) || var1.equalsIgnoreCase(id_break[4])) {
               return id_byte[14];
            } else {
               return !var0.id_protected(id_break[5]) && !var0.id_protected(id_break[6]) && !var0.id_protected(id_break[7]) ? id_byte[16] : id_byte[15];
            }
         }
      };
   }

   private static void id_private() {
      id_private = new float[]{20.0F};
   }

   private static void id_final() {
      id_catch = new long[]{300L, 0L};
   }

   private static void id_native() {
      id_break = new String[]{
         new String("Активация"),
         new String("Трапка"),
         new String("трапки"),
         new String("[★] Трапка"),
         new String("[★] Новогодняя ловушка"),
         new String("trap"),
         new String("christmastrap"),
         new String("spooky-item")
      };
   }

   @Override
   public boolean aK_() {
      this.id_finally();
      Boolean var5 = id_byte[10];
      this.id_class[id_protected[27]] = var5;
      Integer var6 = Integer.valueOf(id_case[5]);
      this.id_class[id_protected[28]] = var6;
      Integer var7 = Integer.valueOf(id_byte[11]);
      this.id_class[id_protected[29]] = var7;
      return super.aK_();
   }
}
