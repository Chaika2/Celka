package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTW extends Fu_1<rJr_1> {
   private static boolean[] id_case;
   private static float[] id_catch;
   private static short[] id_private;
   public Object[] id_class;
   private static String[] id_implements;
   private static byte[] id_finally;
   public static Object[] id_throws;

   private static void id_char() {
      id_catch = new float[]{1.0F};
   }

   public rrTW(vm_3 var1, rJr_1 var2, rJr_1 var3, rgP_2 var4, float[] var5) {
      super(var3, null, var4);
      this.id_final();
      if (var5 != null && var5.length == id_finally[0]) {
         this.id_class[id_private[0]] = var1;
         this.id_class[id_private[1]] = var2;
         this.id_class[id_private[2]] = var5;
         this.id_synchronized = id_private[3];
         this.id_return = id_finally[1];
      } else {
         throw new IllegalArgumentException(id_implements[0]);
      }
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_case = new boolean[]{false, true, false, false, false, true, false, false, true};
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      this.id_final();
      if ((var1 == id_private[6] || ((Qw_1)this.id_volatile.id_class[id_private[7]]).z.id_class(var1, var2)) && (vm_3)this.id_class[id_private[8]] != null) {
         this.id_volatile.id_break((vm_3)this.id_class[id_private[9]]);
         if ((rJr_1)this.id_class[id_private[10]] != null && (cb_3)this.id_volatile.id_class[id_private[11]] != null) {
            cb_3 var10000 = (cb_3)this.id_volatile.id_class[id_private[12]];
            rJr_1 var8 = (rJr_1)this.id_class[id_private[13]];
            var10000.id_implements[id_private[14]] = var8;
         }

         return id_case[5];
      } else {
         return id_case[6];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8746467889157739660L;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, 72, 107, -44, -52, 82, -127, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(Ml_1 var1, float var2, int var3, int var4) {
      this.id_final();
      float[] var5 = (float[])this.id_class[id_private[4]];
      RenderSystem.color4f(var5[id_case[0]], var5[id_case[1]], var5[id_finally[2]], id_catch[0]);
      this.id_volatile.A().id_class((rqO_2)id_throws[id_private[5]]);
      int var6 = this.id_char;
      int var7 = this.id_abstract;
      this.id_break(var1, var6, var7, id_case[2], id_case[3], this.id_synchronized, this.id_return);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      return id_case[4];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -812665479;
   }

   private static void id_finally() {
      id_implements = new String[]{
         new String("ShulkerColors must be an array of three float values representing RGB colors."),
         new String("celestial/images/shulker_preview/container_with_title.png")
      };
   }

   private static void id_package() {
      Object[] var0 = new Object[]{new rqO_2(id_implements[1])};
      id_throws = var0;
   }

   private static void id_abstract() {
      id_private = new short[]{0, 1, 2, 176, 2, 0, 256, 20, 0, 0, 1, 57, 57, 1, 4};
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_native() {
      id_finally = new byte[]{3, 78, 2, 3};
   }
}
