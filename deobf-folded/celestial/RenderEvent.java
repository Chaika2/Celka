package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class RenderEvent {
   public Object[] id_class;
   private static short[] id_byte;
   public static Object[] id_break;
   private static float[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_case;

   public float id_byte() {
      return (Float)this.id_class[2];
   }

   public RenderEvent() {
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   public Ml_1 id_class() {
      return (Ml_1)this.id_class[id_byte[8]];
   }

   public static void id_class(Ml_1 var0, rjV_2 var1, float var2) {
      RenderEvent var3 = id_break(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(var3);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -860559552;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4877203622659303421L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-38, 117, 45, 89, 115, -112, 26, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rjV_2 id_break() {
      return (rjV_2)this.id_class[1];
   }

   public static RenderEvent id_break(Ml_1 var0, rjV_2 var1, float var2) {
      ((RenderEvent)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      ((RenderEvent)id_break[id_byte[2]]).id_class[1] = var1;
      RenderEvent var10000 = (RenderEvent)id_break[id_byte[4]];
      Float var9 = var2;
      var10000.id_class[2] = var9;
      return (RenderEvent)id_break[id_byte[6]];
   }

   private static void id_throws() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new RenderEvent()};
      id_break = var0;
   }

   private static void id_case() {
      id_protected = new float[1];
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[2] = id_protected[0];
      }
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 1, 2};
   }

   private static void id_private() {
      id_case = new boolean[]{false, true};
   }
}
