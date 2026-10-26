package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQb_1 extends rrzq_3 implements PosixFileAttributeView {
   private static String[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_break;
   private static short[] id_throws;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, 16, -79, 91, 92, -80, 116, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[1]];
         Object[] var1 = this.id_break;
         var1[id_protected[2]] = id_protected[3];
      }
   }

   public rrQb_1(rrQs_1 var1, boolean var2) {
      super(var1, id_protected[0]);
      this.id_byte();
      Boolean var7 = var2;
      this.id_break[id_throws[0]] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public String name() {
      this.id_byte();
      return this.id_break[id_throws[1]] ? id_byte[0] : id_byte[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1626437169;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7684748725476388695L;
   }

   @Override
   public Object id_class(rrzT_2 var1, rrzt_3 var2) {
      this.id_byte();
      PosixFileAttributes var3 = (PosixFileAttributes)var2;
      switch (((int[])rrQM.id_class[id_throws[5]])[var1.ordinal()]) {
         case 1:
            return var3.owner();
         case 2:
            return var3.group();
         case 3:
            if (!(Boolean)this.id_break[id_throws[6]]) {
               return var3.permissions();
            }

            return super.id_class(var1, var2);
         default:
            return super.id_class(var1, var2);
      }
   }

   private static void id_class() {
      id_throws = new short[7];
   }

   @Override
   public PosixFileAttributes readAttributes() throws IOException {
      return (PosixFileAttributes)((rrQs_1)this.id_class[id_throws[2]]).id_class();
   }

   private static void id_break() {
      id_byte = new String[]{new String("owner"), new String("posix")};
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, true, false, false};
   }

   @Override
   public UserPrincipal getOwner() throws IOException {
      return this.readAttributes().owner();
   }

   @Override
   public void setOwner(UserPrincipal var1) throws IOException {
      ((rrQs_1)this.id_class[id_throws[3]]).id_class(var1);
   }

   @Override
   public void setGroup(GroupPrincipal var1) throws IOException {
      ((rrQs_1)this.id_class[id_throws[4]]).id_class(var1);
   }
}
