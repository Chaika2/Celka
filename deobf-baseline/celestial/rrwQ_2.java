package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwQ_2 extends rrwk_3 {
   private static short[] id_throws;
   private static boolean[] id_case;
   public static Object[] id_byte;
   private static byte[] id_catch;
   private static String[] id_private;
   public Object[] id_protected;

   @Override
   public rrfq_3 id_byte() {
      return (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[11]];
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, -45, 7, -48, 61, 123, 117, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrwQ_2(C_class var1) {
      super(var1);
      this.id_private();
      HashSet var6 = new HashSet();
      this.id_protected[id_throws[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrnM_2 var1) {
      this.id_private();
      if (this.id_break()) {
         cG_2 var2 = var1.id_class();
         UUID var3 = var2.ro();
         if (var2 != ((Ps_1)this.id_class[id_throws[1]]).id_catch()) {
            if (((List)id_byte[id_throws[2]]).contains(var3)) {
               boolean var4 = ((Set)this.id_protected[id_throws[3]]).add(var3);
               if (var4 && ((Set)this.id_protected[id_throws[4]]).containsAll((List)id_byte[id_throws[5]])) {
                  Boolean var9 = id_case[0];
                  this.id_protected[id_throws[6]] = var9;
               }
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8203038984714619279L;
   }

   @Override
   public void id_class(rrFK var1) {
      super.id_class(var1);
      this.id_protected();
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_private();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_throws[7]]) {
         if (!this.id_break()) {
            return;
         }

         if ((Boolean)this.id_protected[id_throws[8]]) {
            this.id_class(id_case[1]);
            this.id_protected();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1750275312;
   }

   private static void id_throws() {
      id_throws = new short[]{0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 2};
   }

   private static void id_finally() {
      id_private = new String[]{new String("3b01930b-1b2c-2948-a912-07ff6e2346ee"), new String("2c4b7b7d-f822-2d7f-9ae9-929891fcac08")};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{List.of((UUID)UUID.fromString(id_private[0]), (UUID)UUID.fromString(id_private[1]))};
      id_byte = var0;
   }

   private static void id_case() {
      id_catch = new byte[]{2};
   }

   private static void id_implements() {
      id_case = new boolean[]{true, true, false, false, true, false, true};
   }

   private void id_protected() {
      this.id_private();
      ((Set)this.id_protected[id_throws[9]]).clear();
      Boolean var5 = id_case[2];
      this.id_protected[id_throws[10]] = var5;
   }

   private void id_private() {
      if (this.id_protected == null) {
         this.id_protected = new Object[id_catch[0]];
         Object[] var1 = this.id_protected;
         var1[id_case[4]] = id_case[5];
      }
   }
}
