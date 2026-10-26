package celestial;

import java.nio.charset.StandardCharsets;
import java.util.UUID;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLO implements MinecraftAccessor {
   @Nullable
   private Aw_1 id_byte;
   public static Object[] id_class;
   private static short[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;
   @Nullable
   private UUID id_case;
   private static boolean[] id_catch;

   public rgP_2 id_byte() {
      return (rgP_2)this.id_break[0];
   }

   public rrLO() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   @Nullable
   public UUID id_class() {
      return this.id_case;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{52, 15, 33, 82, 2, -128, 49, 87}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_class(rgP_2 var0, @Nullable Aw_1 var1, @Nullable UUID var2) {
      if ((cb_3)id_import.id_class[57] != null) {
         rrLO var3 = id_class(var0, var0.id_byte(), var1, var2);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var3);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
      }
   }

   public static rrLO id_class(rgP_2 var0, String var1, @Nullable Aw_1 var2, @Nullable UUID var3) {
      ((rrLO)id_class[0]).id_break[0] = var0;
      ((rrLO)id_class[0]).id_break[1] = var1;
      ((rrLO)id_class[0]).id_byte = var2;
      ((rrLO)id_class[0]).id_case = var3;
      return (rrLO)id_class[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 888029085;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4731220668415145908L;
   }

   @Nullable
   public Aw_1 id_break() {
      return this.id_byte;
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrLO()};
      id_class = var0;
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private static void id_implements() {
      id_protected = new short[]{0, 0, 0, 1, 0, 0, 0, 57, 0, 0, 0, 1};
   }

   public String id_protected() {
      return (String)this.id_break[1];
   }

   private static void id_private() {
      id_catch = new boolean[]{false, true};
   }
}
