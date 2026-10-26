package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BlocksLift extends Module implements rrnZ_2 {
   private static byte[] id_byte;
   private static double[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;
   private static boolean[] id_catch;
   private static String[] id_private;

   public BlocksLift() {
      super(id_private[0], id_private[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_throws[0]]);
      this.id_super();
      String var10003 = id_private[2];
      String var10004 = id_private[3];
      String[] var10005 = new String[id_byte[0]];
      var10005[id_catch[0]] = id_private[4];
      var10005[id_catch[1]] = id_private[5];
      var10005[id_byte[1]] = id_private[6];
      rrIQ var5 = new rrIQ(var10003, var10004, var10005);
      this.id_break[id_throws[1]] = var5;
      rrfw_3 var6 = new rrfw_3();
      this.id_break[id_throws[2]] = var6;
      this.id_class((rrIQ)this.id_break[id_throws[3]]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new double[]{0.0, 0.0, -0.01, 150.0, 0.42, 300.0, 0.42};
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_super();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[4]]) {
         String var2 = ((rrIQ)this.id_break[id_throws[5]]).id_byte();
         byte var3 = id_byte[2];
         switch (var2.hashCode()) {
            case -1997372447:
               if (var2.equals(id_private[9])) {
                  var3 = id_byte[3];
               }
               break;
            case -1911998296:
               if (var2.equals(id_private[8])) {
                  var3 = id_catch[3];
               }
               break;
            case 68891525:
               if (var2.equals(id_private[7])) {
                  var3 = id_catch[2];
               }
         }

         switch (var3) {
            case 0:
               if (((cb_3)id_import.id_class[id_throws[6]]).BW()
                  && !((cb_3)id_import.id_class[id_throws[7]]).id_class(QP.id_class)
                  && ((rqr_3)((cb_3)id_import.id_class[id_throws[8]]).id_break[id_throws[9]]).id_private) {
                  if ((Integer)((cb_3)id_import.id_class[id_throws[10]]).id_throws[id_throws[11]] % id_byte[4] == 0) {
                     ((Aq_1)((cb_3)id_import.id_class[id_throws[12]]).id_break[id_throws[13]]).id_class(new rZO(id_catch[4]));
                  }

                  if (((cb_3)id_import.id_class[id_throws[14]]).BL()) {
                     ((cb_3)id_import.id_class[id_throws[15]]).sl();
                  } else {
                     ((cb_3)id_import.id_class[id_throws[16]]).rv().id_break = id_protected[0];
                     ((cb_3)id_import.id_class[id_throws[17]]).rv().id_protected = id_protected[1];
                     ((cb_3)id_import.id_class[id_throws[18]]).rv().id_byte = id_protected[2];
                  }
               }
               break;
            case 1:
               if (((cb_3)id_import.id_class[id_throws[19]]).BW()
                  && !((cb_3)id_import.id_class[id_throws[20]]).BL()
                  && !((cb_3)id_import.id_class[id_throws[21]]).id_class(QP.id_class)
                  && ((rqr_3)((cb_3)id_import.id_class[id_throws[22]]).id_break[id_throws[23]]).id_private) {
                  rrfj_3.id_class(id_catch[5]);
                  if (((rrfw_3)this.id_break[id_throws[24]]).id_class(id_protected[3])) {
                     ((cb_3)id_import.id_class[id_throws[25]]).rv().id_byte = id_protected[4];
                     ((Aq_1)((cb_3)id_import.id_class[id_throws[26]]).id_break[id_throws[27]]).id_break(new rZO(id_catch[6]));
                  }

                  if (((rrfw_3)this.id_break[id_throws[28]]).id_class(id_protected[5])) {
                     ((rrfw_3)this.id_break[id_throws[29]]).id_class();
                  }

                  Boolean var8 = id_catch[7];
                  this.id_break[id_throws[30]] = var8;
               } else if ((Boolean)this.id_break[id_throws[31]]) {
                  Boolean var9 = id_catch[8];
                  this.id_break[id_throws[32]] = var9;
               }
               break;
            case 2:
               if (((cb_3)id_import.id_class[id_throws[33]]).BW() && ((rqr_3)((cb_3)id_import.id_class[id_throws[34]]).id_break[id_throws[35]]).id_private) {
                  rrIU.id_class();
                  ((cb_3)id_import.id_class[id_throws[36]]).rv().id_byte = id_protected[6];
                  if ((Integer)((cb_3)id_import.id_class[id_throws[37]]).id_throws[id_throws[38]] % id_byte[5] == 0) {
                     ((Aq_1)((cb_3)id_import.id_class[id_throws[39]]).id_break[id_throws[40]]).id_class(new rZO(id_catch[9]));
                  }
               }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7426730992217074188L;
   }

   @Override
   public void id_class() {
      this.id_byte(id_catch[11]);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1201437588;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, -15, -85, 80, -44, 41, 118, 91}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_super();
      super.id_throws(var1);
      Boolean var6 = id_catch[10];
      this.id_break[id_throws[41]] = var6;
      ((rrfw_3)this.id_break[id_throws[42]]).id_class();
   }

   private static void id_continue() {
      id_byte = new byte[]{3, 2, -1, 2, 2, 2, 3, 2};
   }

   private static void id_else() {
      id_catch = new boolean[]{false, true, false, true, true, true, true, true, false, true, false, false, false};
   }

   private static void id_new() {
      id_throws = new short[]{
         1,
         0,
         1,
         0,
         0,
         0,
         57,
         57,
         57,
         17,
         57,
         41,
         57,
         0,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         17,
         1,
         57,
         57,
         0,
         1,
         1,
         2,
         2,
         2,
         57,
         57,
         17,
         57,
         57,
         41,
         57,
         0,
         2,
         1
      };
   }

   private static void id_return() {
      id_private = new String[]{
         new String("Blocks Lift"),
         new String("Позволяет подниматься в блоках"),
         new String("Режим"),
         new String("Packet"),
         new String("Packet"),
         new String("Glide"),
         new String("Matrix"),
         new String("Glide"),
         new String("Packet"),
         new String("Matrix")
      };
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         this.id_break[2] = false;
      }
   }
}
