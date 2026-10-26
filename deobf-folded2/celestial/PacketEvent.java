package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PacketEvent {
   public Object[] id_class;
   public static Object[] id_break;
   private static byte[] id_byte;
   private static boolean[] id_protected;
   private static short[] id_throws;

   public rfH_2 id_byte() {
      return (rfH_2)this.id_class[0];
   }

   public PacketEvent() {
      this.id_protected();
   }

   static {
      ntfClinit();
   }

   public static PacketEvent id_class(rfH_2 var0, xc_3 var1, boolean var2) {
      ((PacketEvent)id_break[0]).id_class[0] = var0;
      ((PacketEvent)id_break[0]).id_class[1] = var1;
      PacketEvent var10000 = (PacketEvent)id_break[0];
      Boolean var9 = var2;
      var10000.id_class[2] = var9;
      return (PacketEvent)id_break[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, 123, 12, -13, 87, 41, -40, -61}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4215491972428475281L;
   }

   public xc_3 id_class() {
      return (xc_3)this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 618046214;
   }

   public boolean id_break() {
      return (Boolean)this.id_class[2];
   }

   public static PacketEvent id_break(rfH_2 var0, xc_3 var1, boolean var2) {
      PacketEvent var3 = id_class(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var3);
      return var3;
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new PacketEvent()};
      id_break = var0;
   }

   private static void id_catch() {
      id_protected = new boolean[]{false, false, true};
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[2] = false;
      }
   }

   private static void id_private() {
      id_byte = new byte[]{3, 2};
   }
}
