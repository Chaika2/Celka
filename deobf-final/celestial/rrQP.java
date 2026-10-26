package celestial;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQP extends rrzY_2 implements PosixFileAttributes {
   public Object[] throws_;
   private static short[] case_;
   private static byte[] catch_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{30, -93, -64, -108, -107, -8, -33, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrQP(byte[] var1, Path var2, int var3, FileAttribute<?>[] var4, FileAttribute... var5) {
      super(var2, var3, var4, var5);
      this.finally_();
      this.throws_[2] = var1;
      UserPrincipal var11 = (UserPrincipal)((rrzf_3)this.throws_[2]).break_[13];
      this.throws_[0] = var11;
      GroupPrincipal var12 = (GroupPrincipal)((rrzf_3)this.throws_[2]).break_[14];
      this.throws_[1] = var12;
   }

   public rrQP(rrzf_3 var1, rrQP var2, int var3) {
      super(var2, var3);
      this.finally_();
      this.throws_[2] = var1;
      UserPrincipal var9 = (UserPrincipal)((rrzf_3)this.throws_[2]).break_[13];
      this.throws_[0] = var9;
      GroupPrincipal var10 = (GroupPrincipal)((rrzf_3)this.throws_[2]).break_[14];
      this.throws_[1] = var10;
      UserPrincipal var11 = (UserPrincipal)var2.throws_[0];
      this.throws_[0] = var11;
      GroupPrincipal var12 = (GroupPrincipal)var2.throws_[1];
      this.throws_[1] = var12;
   }

   public rrQP(rrzf_3 var1, byte[] var2, boolean var3, int var4) {
      super(var2, var3, var4);
      this.finally_();
      this.throws_[2] = var1;
      UserPrincipal var10 = (UserPrincipal)((rrzf_3)this.throws_[2]).break_[13];
      this.throws_[0] = var10;
      GroupPrincipal var11 = (GroupPrincipal)((rrzf_3)this.throws_[2]).break_[14];
      this.throws_[1] = var11;
   }

   public rrQP(rrzf_3 var1, rrQP var2, int var3, int var4) {
      super(var2, var3);
      this.finally_();
      this.throws_[2] = var1;
      UserPrincipal var10 = (UserPrincipal)((rrzf_3)this.throws_[2]).break_[13];
      this.throws_[0] = var10;
      GroupPrincipal var11 = (GroupPrincipal)((rrzf_3)this.throws_[2]).break_[14];
      this.throws_[1] = var11;
      Integer var12 = var4;
      this.class_[6] = var12;
   }

   public rrQP(byte[] var1, int var2, boolean var3, int var4, FileAttribute<?>[] var5, FileAttribute... var6) {
      super(var2, var3, var4, var5, var6);
      this.finally_();
      this.throws_[2] = var1;
      UserPrincipal var12 = (UserPrincipal)((rrzf_3)this.throws_[2]).break_[13];
      this.throws_[0] = var12;
      GroupPrincipal var13 = (GroupPrincipal)((rrzf_3)this.throws_[2]).break_[14];
      this.throws_[1] = var13;
   }

   public rrQP(rrzf_3 var1, rrzf_3 var2, rrzi_3 var3) throws IOException {
      super(var2, var3);
      this.finally_();
      this.throws_[2] = var1;
      UserPrincipal var9 = (UserPrincipal)((rrzf_3)this.throws_[2]).break_[13];
      this.throws_[0] = var9;
      GroupPrincipal var10 = (GroupPrincipal)((rrzf_3)this.throws_[2]).break_[14];
      this.throws_[1] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public GroupPrincipal group() {
      this.finally_();
      return (GroupPrincipal)this.throws_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6412944039157437110L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1176014434;
   }

   @Override
   public Set<PosixFilePermission> permissions() {
      this.finally_();
      return this.class_().orElse(Set.copyOf((Set)((rrzf_3)this.throws_[2]).break_[15]));
   }

   @Override
   public UserPrincipal owner() {
      this.finally_();
      return (UserPrincipal)this.throws_[0];
   }

   private void finally_() {
      if (this.throws_ == null) {
         this.throws_ = new Object[3];
         Object[] var1 = this.throws_;
      }
   }

   private static void extends_() {
      case_ = new short[]{
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         6,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         0,
         0,
         1,
         1,
         2,
         2,
         13,
         0,
         2,
         14,
         1,
         0,
         1,
         2,
         15
      };
   }

   private static void implements_() {
      catch_ = new byte[]{3};
   }
}
