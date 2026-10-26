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
   private static String[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static short[] throws_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, 16, -79, 91, 92, -80, 116, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   public rrQb_1(rrQs_1 var1, boolean var2) {
      super(var1, true);
      this.byte_();
      Boolean var7 = var2;
      this.break_[0] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public String name() {
      this.byte_();
      return this.break_[0] ? "owner" : byte_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1626437169;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7684748725476388695L;
   }

   @Override
   public Object class_(rrzT_2 var1, rrzt_3 var2) {
      this.byte_();
      PosixFileAttributes var3 = (PosixFileAttributes)var2;
      switch (((int[])rrQM.class_[0])[var1.ordinal()]) {
         case 1:
            return var3.owner();
         case 2:
            return var3.group();
         case 3:
            if (!(Boolean)this.break_[0]) {
               return var3.permissions();
            }

            return super.class_(var1, var2);
         default:
            return super.class_(var1, var2);
      }
   }

   private static void class_() {
      throws_ = new short[7];
   }

   @Override
   public PosixFileAttributes readAttributes() throws IOException {
      return (PosixFileAttributes)((rrQs_1)this.class_[0]).class_();
   }

   private static void break_() {
      byte_ = new String[]{new String("owner"), new String("posix")};
   }

   private static void protected_() {
      protected_ = new boolean[]{true, true, false, false};
   }

   @Override
   public UserPrincipal getOwner() throws IOException {
      return this.readAttributes().owner();
   }

   @Override
   public void setOwner(UserPrincipal var1) throws IOException {
      ((rrQs_1)this.class_[0]).class_(var1);
   }

   @Override
   public void setGroup(GroupPrincipal var1) throws IOException {
      ((rrQs_1)this.class_[0]).class_(var1);
   }
}
