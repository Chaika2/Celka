package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoExp extends Module implements rrnF_2 {
   private static byte[] id_byte;
   private static float[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;
   private static long[] id_catch;
   private static String[] id_private;
   private static boolean[] id_implements;

   public AutoExp() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_return();
      rrIF var5 = new rrIF(id_private[2], (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_throws[1]]);
      this.id_break[id_throws[2]] = var5;
      rrIm_1 var6 = new rrIm_1(id_private[3], id_protected[0], id_protected[1], id_protected[2], id_protected[3]);
      this.id_break[id_throws[3]] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.id_break[id_throws[4]] = var7;
      rrTT var8 = new rrTT(this);
      this.id_break[id_throws[5]] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.id_break[id_throws[6]] = var9;
      Integer var10 = Integer.valueOf(id_byte[0]);
      this.id_break[id_throws[7]] = var10;
      Integer var11 = Integer.valueOf(id_byte[1]);
      this.id_break[id_throws[8]] = var11;
      Setting[] var10001 = new Setting[id_byte[2]];
      var10001[id_implements[0]] = (rrIF)this.id_break[id_throws[9]];
      var10001[id_implements[1]] = (rrIm_1)this.id_break[id_throws[10]];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_implements = new boolean[]{false, true, true, false, false, true, false, false};
   }

   @EventTarget(
      id_class = -100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[11]]) {
         ((rrfP_2)this.id_break[id_throws[12]])
            .id_class(
               this.id_break[id_throws[13]] == id_byte[3] && rqR_2.id_break() - this.id_break[id_throws[14]] > id_catch[0]
                  ? id_implements[2]
                  : id_implements[3]
            );
         if (((rrIF)this.id_break[id_throws[15]]).id_break()) {
            int var2 = rrfY_2.id_class(rdy_3.xe, id_implements[4], id_implements[5]);
            if (var2 == id_byte[4]) {
               this.id_new();
               return;
            }

            rrTg_1 var3 = () -> ((cb_3)id_import.id_class[id_throws[49]]).id_goto().id_case(id_protected[7]);
            ((rrTT)this.id_break[id_throws[16]]).id_class(var3, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_throws[17]]);
            if (!((cb_3)id_import.id_class[id_throws[18]]).z().id_break(var3.getNeedRotation(), id_protected[4])) {
               return;
            }

            if (((rrfw_3)this.id_break[id_throws[19]]).id_class((double)((rrIm_1)this.id_break[id_throws[20]]).id_byte().floatValue())) {
               int var4 = this.id_class(var2);
               if (var4 > id_byte[5] && (Integer)this.id_break[id_throws[21]] == id_byte[6]) {
                  Integer var9 = var4;
                  this.id_break[id_throws[22]] = var9;
               }

               ((rrfw_3)this.id_break[id_throws[23]]).id_class();
            }
         } else {
            this.id_new();
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_return();
      ((rrfP_2)this.id_break[id_throws[24]]).id_class(var1);
   }

   private int id_class(int var1) {
      this.id_return();
      if (var1 == id_byte[7]) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == id_byte[8]) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < id_byte[9]) {
         Integer var6 = ((rhz_3)((cb_3)id_import.id_class[id_throws[25]]).id_implements[id_throws[26]]).id_protected;
         this.id_break[id_throws[27]] = var6;
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((Ax_1)id_import.id_class[id_throws[28]]).id_break = (Integer)this.id_break[id_throws[29]];
         return var1;
      } else if (var1 >= id_byte[10] && var1 <= id_byte[11] && rqR_2.id_break() - (Long)this.id_break[id_throws[30]] > id_catch[1]) {
         ((rrfP_2)this.id_break[id_throws[31]]).id_class(((rhz_3)((cb_3)id_import.id_class[id_throws[32]]).id_implements[id_throws[33]]).id_protected);
         ((Ax_1)id_import.id_class[id_throws[34]]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var7 = rqR_2.id_break();
         this.id_break[id_throws[35]] = var7;
         return var1;
      } else {
         return id_byte[12];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3703566411899288495L;
   }

   @Override
   public float id_break() {
      return id_protected[5];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 82, -24, -86, -45, -89, 37, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 573967953;
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_new();
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_throws[36]];
   }

   private static void id_goto() {
      id_private = new String[]{
         new String("Auto Exp"), new String("Автоматически кидает пузырьки\nс опытом под ноги"), new String("Кидать на"), new String("Задержка")
      };
   }

   private static void id_continue() {
      id_protected = new float[]{0.0F, 0.0F, 100.0F, 10.0F, 3.0F, -1.0F, -1.0F, 90.0F};
   }

   private static void id_else() {
      id_byte = new byte[]{-1, -1, 2, -1, -1, 8, -1, -2, -3, 9, 9, 36, -1, -1, -1, -1, -1, 8, 5, 6, 7};
   }

   public void id_new() {
      this.id_return();
      ((rrTT)this.id_break[id_throws[38]]).id_final();
      ((rrTT)this.id_break[id_throws[39]]).id_finally();
      ((rrfw_3)this.id_break[id_throws[40]]).id_class();
      if ((Integer)this.id_break[id_throws[41]] != id_byte[13]) {
         ((Ax_1)id_import.id_class[id_throws[42]]).id_class((Integer)this.id_break[id_throws[43]]);
         Long var5 = rqR_2.id_break();
         this.id_break[id_throws[44]] = var5;
         Integer var6 = Integer.valueOf(id_byte[14]);
         this.id_break[id_throws[45]] = var6;
      }

      if ((Integer)this.id_break[id_throws[46]] != id_byte[15]) {
         rrfo_3.id_class((Integer)this.id_break[id_throws[47]]);
         Integer var7 = Integer.valueOf(id_byte[16]);
         this.id_break[id_throws[48]] = var7;
      }
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[8];
         this.id_break[5] = 0L;
         this.id_break[6] = 0;
         this.id_break[7] = 0;
      }
   }

   private static void id_while() {
      id_catch = new long[]{200L, 300L, 0L};
   }

   private static void id_public() {
      id_throws = new short[]{
         3,
         0,
         0,
         1,
         2,
         3,
         4,
         6,
         7,
         0,
         1,
         0,
         2,
         7,
         5,
         0,
         3,
         0,
         57,
         4,
         1,
         7,
         7,
         4,
         2,
         57,
         1,
         6,
         55,
         6,
         5,
         2,
         57,
         1,
         55,
         5,
         0,
         57,
         3,
         3,
         4,
         7,
         55,
         7,
         5,
         7,
         6,
         6,
         6,
         57
      };
   }

   @Override
   public float id_private() {
      return id_protected[6];
   }

   @Override
   public rrTq_1 aB_() {
      return new rrTq_1(rjG_2.id_catch(), ((cb_3)id_import.id_class[id_throws[37]]).id_goto());
   }
}
