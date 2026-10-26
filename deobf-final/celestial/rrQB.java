package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.ProviderMismatchException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQB extends FileSystemProvider {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static String[] throws_;

   private static void byte_() {
      throws_ = new String[]{new String("jar"), new String("!/"), new String(".zip"), new String(".jar"), new String("!/"), new String("Not supported.")};
   }

   public rrQB() {
      this.throws_();
      HashMap var5 = new HashMap();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean isHidden(Path var1) {
      return class_(var1).finally_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1959264744924384480L;
   }

   private rrzf_3 class_(Path var1, Map<String, ?> var2) throws IOException {
      try {
         return new rrzf_3(this, var1, var2);
      } catch (ZipException var5) {
         String var4 = var1.toString();
         if (!var4.endsWith(".zip") && !var4.endsWith(".jar")) {
            throw new UnsupportedOperationException();
         } else {
            throw var5;
         }
      }
   }

   private static void class_() {
      break_ = new short[9];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2097541890;
   }

   public Path class_(URI var1) {
      String var2 = var1.getScheme();
      if (var2 != null && var2.equalsIgnoreCase(this.getScheme())) {
         try {
            String var3 = var1.getRawSchemeSpecificPart();
            int var4 = var3.indexOf(throws_[1]);
            if (var4 != byte_[0]) {
               var3 = var3.substring(protected_[0], var4);
            }

            return Paths.get(new URI(var3)).toAbsolutePath();
         } catch (URISyntaxException var5) {
            throw new IllegalArgumentException(var5.getMessage(), var5);
         }
      } else {
         throw new IllegalArgumentException("URI scheme is not '" + this.getScheme() + "'");
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -38, 64, 47, -38, -4, 7, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(Path var1, rrzf_3 var2) throws IOException {
      synchronized ((Map)this.class_[0]) {
         PrivilegedExceptionAction var5 = () -> var1.toRealPath();

         try {
            var1 = AccessController.doPrivileged(var5);
         } catch (PrivilegedActionException var8) {
            throw (IOException)var8.getException();
         }

         if (((Map)this.class_[break_[7]]).get(var1) == var2) {
            ((Map)this.class_[break_[8]]).remove(var1);
         }
      }
   }

   public static rrQs_1 class_(Path var0) {
      if (var0 == null) {
         throw new NullPointerException();
      } else if (!(var0 instanceof rrQs_1)) {
         throw new ProviderMismatchException();
      } else {
         return (rrQs_1)var0;
      }
   }

   @Override
   public void delete(Path var1) throws IOException {
      class_(var1).byte_();
   }

   @Override
   public void checkAccess(Path var1, AccessMode... var2) throws IOException {
      class_(var1).class_(var2);
   }

   @Override
   public void copy(Path var1, Path var2, CopyOption... var3) throws IOException {
      class_(var1).break_(class_(var2), var3);
   }

   @Override
   public String getScheme() {
      return "jar";
   }

   @Override
   public Path getPath(URI var1) {
      String var2 = var1.getSchemeSpecificPart();
      int var3 = var2.indexOf("!/");
      if (var3 == -1) {
         throw new IllegalArgumentException("URI: " + var1 + " does not contain path info ex. jar:file:/c:/foo.zip!/BAR");
      } else {
         return this.getFileSystem(var1).getPath(var2.substring(var3 + 1));
      }
   }

   @Override
   public <A extends BasicFileAttributes> A readAttributes(Path var1, Class<A> var2, LinkOption... var3) throws IOException {
      return class_(var1).class_(var2);
   }

   @Override
   public Map<String, Object> readAttributes(Path var1, String var2, LinkOption... var3) throws IOException {
      return class_(var1).class_(var2, var3);
   }

   @Override
   public FileChannel newFileChannel(Path var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      return class_(var1).break_(var2, var3);
   }

   @Override
   public AsynchronousFileChannel newAsynchronousFileChannel(Path var1, Set<? extends OpenOption> var2, ExecutorService var3, FileAttribute<?>... var4) {
      throw new UnsupportedOperationException();
   }

   @Override
   public <V extends FileAttributeView> V getFileAttributeView(Path var1, Class<V> var2, LinkOption... var3) {
      return class_(var1).break_(var2);
   }

   @Override
   public void move(Path var1, Path var2, CopyOption... var3) throws IOException {
      class_(var1).class_(class_(var2), var3);
   }

   private boolean break_(Path var1) {
      try {
         BasicFileAttributes var2 = Files.readAttributes(var1, BasicFileAttributes.class);
         if (!var2.isRegularFile()) {
            throw new UnsupportedOperationException();
         } else {
            return protected_[2];
         }
      } catch (IOException var3) {
         return false;
      }
   }

   private static void break_() {
      protected_ = new boolean[]{false, false, true, false, false, false, true, false, false, false, true};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      byte_ = new byte[]{-1, -1};
   }

   @Override
   public boolean isSameFile(Path var1, Path var2) throws IOException {
      return class_(var1).break_(var2);
   }

   @Override
   public FileSystem newFileSystem(Path var1, Map<String, ?> var2) throws IOException {
      this.break_(var1);
      return this.class_(var1, var2);
   }

   @Override
   public FileSystem newFileSystem(URI var1, Map<String, ?> var2) throws IOException {
      Path var3 = this.class_(var1);
      synchronized ((Map)this.class_[0]) {
         Path var5 = null;
         if (this.break_(var3)) {
            var5 = var3.toRealPath();
            if (((Map)this.class_[break_[2]]).containsKey(var5)) {
               throw new FileSystemAlreadyExistsException();
            }
         }

         rrzf_3 var6 = this.class_(var3, var2);
         if (var5 == null) {
            var5 = var3.toRealPath();
         }

         ((Map)this.class_[break_[3]]).put(var5, var6);
         return var6;
      }
   }

   @Override
   public SeekableByteChannel newByteChannel(Path var1, Set<? extends OpenOption> var2, FileAttribute<?>... var3) throws IOException {
      return class_(var1).class_(var2, var3);
   }

   @Override
   public FileStore getFileStore(Path var1) throws IOException {
      return class_(var1).catch_();
   }

   @Override
   public DirectoryStream<Path> newDirectoryStream(Path var1, Filter<? super Path> var2) throws IOException {
      return class_(var1).class_(var2);
   }

   @Override
   public Path readSymbolicLink(Path var1) {
      throw new UnsupportedOperationException("Not supported.");
   }

   @Override
   public void setAttribute(Path var1, String var2, Object var3, LinkOption... var4) throws IOException {
      class_(var1).class_(var2, var3, var4);
   }

   @Override
   public InputStream newInputStream(Path var1, OpenOption... var2) throws IOException {
      InputStream var3 = rrzL_2.class_(var1, var2);
      return var3 != null ? var3 : class_(var1).break_(var2);
   }

   @Override
   public OutputStream newOutputStream(Path var1, OpenOption... var2) throws IOException {
      return class_(var1).class_(var2);
   }

   @Override
   public void createDirectory(Path var1, FileAttribute<?>... var2) throws IOException {
      class_(var1).class_(var2);
   }

   @Override
   public FileSystem getFileSystem(URI var1) {
      synchronized ((Map)this.class_[0]) {
         rrzf_3 var3 = null;

         try {
            var3 = (rrzf_3)((Map)this.class_[break_[5]]).get(this.class_(var1).toRealPath());
         } catch (IOException var6) {
         }

         if (var3 == null) {
            throw new FileSystemNotFoundException();
         } else {
            return var3;
         }
      }
   }
}
