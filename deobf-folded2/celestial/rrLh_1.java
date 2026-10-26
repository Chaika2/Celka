package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLh_1 extends Om_1 {
   @Nullable
   private Aw_1 id_byte;
   private static boolean[] id_protected;
   public static Object[] id_class;
   private static short[] id_throws;
   private static byte[] id_case;
   @Nullable
   private UUID id_catch;
   public Object[] id_break;

   public rrLh_1() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4686855948117934490L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, 15, -16, 122, -48, -107, -84, 107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrLh_1 id_class(rgP_2 var0, UUID var1) {
      rrLh_1 var2 = id_class(var0, var0.id_byte(), var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var2);
      return var2;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1867365368;
   }

   public static rrLh_1 id_class(rgP_2 var0, String var1, UUID var2) {
      ((rrLh_1)id_class[0]).id_break[0] = var0;
      ((rrLh_1)id_class[0]).id_break[1] = var1;
      ((rrLh_1)id_class[0]).id_byte = rrfV_2.id_class(var0, var1);
      ((rrLh_1)id_class[0]).id_catch = var2;
      ((rrLh_1)id_class[0]).id_class(false);
      return (rrLh_1)id_class[0];
   }

   public String id_class() {
      this.id_case();
      return (String)this.id_break[1];
   }

   public void id_class(rgP_2 var1) {
      this.id_case();
      this.id_break[0] = var1;
   }

   @Nullable
   public UUID id_break() {
      return this.id_catch;
   }

   public rgP_2 id_throws() {
      this.id_case();
      return (rgP_2)this.id_break[0];
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{new rrLh_1()};
      id_class = var0;
   }

   private static void id_catch() {
      id_case = new byte[]{2};
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_implements() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0};
   }

   @Nullable
   public Aw_1 id_protected() {
      return this.id_byte;
   }

   private static void id_private() {
      id_protected = new boolean[]{false, false, true};
   }
}
