package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpo_3 extends rrpi_3 implements rrnF_2 {
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_case;
   public Object[] id_class;
   public static Object[] id_break;
   private static String[] id_catch;
   private static short[] id_private;

   private int id_byte(int var1) {
      if (var1 == id_case[5]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_case[6]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_case[7]) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[id_private[36]]).id_implements[id_private[37]]).id_protected);
         return var1;
      } else if (var1 >= id_case[8] && var1 <= id_case[9]) {
         ((Ax_1)id_import.id_class[id_private[38]])
            .id_class(
               ((rJr_1)((cb_3)id_import.id_class[id_private[39]]).id_implements[id_private[40]]).id_case,
               var1,
               ((rhz_3)((cb_3)id_import.id_class[id_private[41]]).id_implements[id_private[42]]).id_protected,
               rXa_1.SWAP
            );
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[43]]).id_finally().id_class(rrLY.id_class());
         return var1;
      } else {
         return id_case[10];
      }
   }

   @Override
   public rdn_3 id_byte() {
      return (rdn_3)id_break[id_private[44]];
   }

   private void id_int() {
      this.id_goto();
      Boolean var5 = id_byte[4];
      this.id_class[id_private[29]] = var5;
      Integer var6 = Integer.valueOf(id_byte[5]);
      this.id_class[id_private[30]] = var6;
      Integer var7 = Integer.valueOf(id_case[3]);
      this.id_class[id_private[31]] = var7;
   }

   public rrpo_3(HwHelper var1) {
      super(var1);
      this.id_goto();
      rrIF var6 = new rrIF(id_catch[0], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_private[0]]);
      this.id_class[id_private[1]] = var6;
      rrTT var7 = new rrTT(this);
      this.id_class[id_private[2]] = var7;
      Integer var8 = Integer.valueOf(id_case[0]);
      this.id_class[id_private[3]] = var8;
      String var10003 = id_catch[1];
      Setting[] var10004 = new Setting[id_byte[0]];
      var10004[id_byte[1]] = (rrIF)this.id_class[id_private[4]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, 2, -1, -2, -3, 45, -1, 5, 2, 3, 4};
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_goto();
      if (var1.id_break() == ((rrIF)this.id_class[id_private[5]]).id_finally().id_byte()) {
         Boolean var6 = id_byte[2];
         this.id_class[id_private[6]] = var6;
      }
   }

   private rrpD_2 id_class(int var1) {
      if (var1 == id_case[4]) {
         return (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[32]];
      } else {
         return ((cb_3)id_import.id_class[id_private[33]]).sK().id_class(rdy_3.hU)
            ? (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[34]]
            : (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[35]];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, -99, -35, 12, -51, -28, -125, -73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1993715081852602429L;
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[7]] && (Boolean)this.id_class[id_private[8]]) {
         HwHelper var2 = this.id_continue();
         int var3 = this.id_while();
         int var4 = this.id_public();
         rrpD_2 var5 = this.id_class(var3);
         switch (((int[])rrpK_2.id_class[id_private[9]])[var5.ordinal()]) {
            case 1:
               int var6 = ((cb_3)id_import.id_class[id_private[10]]).sK().id_protected(rdy_3.hU);
               float var7 = (float)var6 / id_protected[0];
               rrfu_3.id_class(var2, id_catch[2], var7);
               this.id_int();
               return;
            case 2:
               this.id_int();
               return;
         }

         if (var5 == (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[id_private[11]]) {
            if (var4 > 0) {
               ((rrTT)this.id_class[id_private[12]])
                  .id_class(
                     (rrTg_1)() -> new PX(
                           (Float)((cb_3)id_import.id_class[id_private[53]]).id_break[id_private[54]],
                           (Float)((cb_3)id_import.id_class[id_private[55]]).id_break[id_private[56]]
                        ),
                     (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_private[13]]
                  );
            }

            if (var4 != 0) {
               int var10002 = (Integer)this.id_class[id_private[14]] + id_byte[3];
               Integer var12 = var10002;
               this.id_class[id_private[15]] = var12;
               if (var10002 < var4) {
                  return;
               }
            }

            if ((Integer)this.id_class[id_private[16]] == id_case[1]) {
               Integer var13 = this.id_byte(var3);
               this.id_class[id_private[17]] = var13;
            }

            if ((Integer)this.id_class[id_private[18]] > id_case[2]) {
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[19]]).id_private().P().id_super()) {
                  rrfo_3.id_class(rpm_3.MAIN_HAND);
                  ((Ax_1)id_import.id_class[id_private[20]])
                     .id_class(
                        ((rJr_1)((cb_3)id_import.id_class[id_private[21]]).id_implements[id_private[22]]).id_case,
                        (Integer)this.id_class[id_private[23]],
                        ((rhz_3)((cb_3)id_import.id_class[id_private[24]]).id_implements[id_private[25]]).id_protected,
                        rXa_1.SWAP
                     );
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[26]]).id_finally().id_class(rrLY.id_class());
                  this.id_int();
               }
            } else {
               this.id_int();
            }

            if (var4 != 0) {
               ((rrTT)this.id_class[id_private[27]]).id_final();
               ((rrTT)this.id_class[id_private[28]]).id_finally();
            }
         }
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -377898209;
   }

   @Override
   public float id_break() {
      return id_protected[1];
   }

   @Override
   public rrIF id_throws() {
      this.id_goto();
      return (rrIF)this.id_class[id_private[45]];
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_private[52]];
   }

   private void id_goto() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         this.id_class[2] = false;
         this.id_class[3] = 0;
         this.id_class[4] = 0;
      }
   }

   private static void id_else() {
      id_private = new short[]{
         0,
         0,
         1,
         3,
         0,
         0,
         2,
         0,
         2,
         0,
         57,
         0,
         1,
         0,
         4,
         4,
         3,
         3,
         3,
         0,
         55,
         57,
         4,
         3,
         57,
         1,
         0,
         1,
         1,
         2,
         4,
         3,
         1,
         57,
         2,
         0,
         57,
         1,
         55,
         57,
         4,
         57,
         1,
         0,
         0,
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

   private static void id_new() {
      id_byte = new boolean[]{true, false, true, true, false, false, false, false, true, false, false, false, false, true};
   }

   private static void id_return() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.hU, 1)};
      id_break = var0;
   }

   private int id_while() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return id_case[12];
      } else if (var1.test(((cb_3)id_import.id_class[id_private[48]]).ss())) {
         return id_case[13];
      } else if (var1.test(((cb_3)id_import.id_class[id_private[49]]).Sn())) {
         return id_case[14];
      } else {
         for (int var2 = id_byte[7]; var2 < id_case[15]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_private[50]]).id_implements[id_private[51]]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_case[16];
      }
   }

   private int id_public() {
      return (C_volatile)rrTT.id_break[id_private[46]] instanceof rrTT && ((C_volatile)rrTT.id_break[id_private[47]]).id_byte() != null
         ? id_case[11]
         : id_byte[6];
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> rrjk_3.id_case(var0);
   }

   @Override
   public float id_private() {
      return id_protected[2];
   }

   private static void id_final() {
      id_catch = new String[]{new String("Активация"), new String("Ком снега"), new String("кома снега")};
   }

   private static void id_synchronized() {
      id_protected = new float[]{20.0F, -1.0F, -1.0F};
   }

   @Override
   public boolean aK_() {
      this.id_int();
      return super.aK_();
   }
}
