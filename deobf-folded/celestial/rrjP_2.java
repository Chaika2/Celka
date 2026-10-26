package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjP_2 implements Hx_1 {
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   public static Object[] id_break;
   private static float[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         this.id_class[1] = 0.0F;
         this.id_class[2] = false;
      }
   }

   private rrjP_2() {
      this.id_byte();
      Float var5 = 1.0F;
      this.id_class[1] = var5;
      Boolean var6 = true;
      this.id_class[2] = var6;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{84, 0, -19, 12, -44, -13, 30, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 827685818595404655L;
   }

   public rrjP_2 id_class(Hx_1 var1, float var2) {
      return this.id_class(var1, var2, true);
   }

   public rrjP_2 id_class(Hx_1 var1, float var2, boolean var3) {
      this.id_class[id_protected[2]] = var1;
      Float var9 = var2;
      this.id_class[1] = var9;
      Boolean var10 = var3;
      this.id_class[2] = var10;
      return this;
   }

   private static HU id_class(HU var0) {
      rqO_2 var1 = var0.id_float();
      if (var1 == null) {
         return var0;
      } else {
         String var2 = var0.id_byte();
         byte var3 = -1;
         switch (var2.hashCode()) {
            case -1421971032:
               if (var2.equals(id_catch[0])) {
                  var3 = id_case[2];
               }
               break;
            case 199548894:
               if (var2.equals(id_catch[3])) {
                  var3 = 3;
               }
               break;
            case 427217305:
               if (var2.equals(id_catch[2])) {
                  var3 = 2;
               }
               break;
            case 1077098319:
               if (var2.equals(id_catch[1])) {
                  var3 = 1;
               }
         }
         return switch (var3) {
            case 0, 1 -> HU.id_catch(var1);
            case 2, 3 -> HU.id_private(var1);
            default -> var0;
         };
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1672539521;
   }

   private static void id_break() {
      id_case = new boolean[]{true, true, false, true, false, true, false, true};
   }

   private static void id_throws() {
      id_byte = new byte[]{-1, 2, 3, 3, 2};
   }

   @Override
   public Ok_1 getBuffer(HU var1) {
      HU var2 = id_class(var1);
      Ok_1 var3 = ((Hx_1)this.id_class[id_protected[5]]).getBuffer(var2);
      return (Ok_1)(this.id_class[2] ? new rrjB_2().id_class(var3, (Float)this.id_class[1]) : var3);
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrjP_2()};
      id_break = var0;
   }

   private static void id_case() {
      id_protected = new short[]{1, 2, 0, 1, 2, 0, 2, 1};
   }

   private static void id_protected() {
      id_catch = new String[]{
         new String("entity_cutout"), new String("entity_solid"), new String("entity_cutout_no_cull"), new String("entity_cutout_no_cull_z_offset")
      };
   }

   private static void id_private() {
      id_throws = new float[]{1.0F, 0.0F};
   }
}
