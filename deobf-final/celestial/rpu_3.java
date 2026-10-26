package celestial;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rpu_3 {
   private static final Logger break_ = LogManager.getLogger();
   public static final ListeningExecutorService class_ = MoreExecutors.listeningDecorator(
      Executors.newCachedThreadPool(
         new ThreadFactoryBuilder().setDaemon(true).setUncaughtExceptionHandler(new rya_3(break_)).setNameFormat("Downloader %d").build()
      )
   );

   public static CompletableFuture<?> class_(File var0, String var1, Map<String, String> var2, int var3, rpC_2 var4, Proxy var5) {
      return CompletableFuture.supplyAsync(() -> {
         HttpURLConnection var6 = null;
         InputStream var7 = null;
         DataOutputStream var8 = null;
         if (var4 != null) {
            var4.byte_(new rgn_3("resourcepack.downloading"));
            var4.protected_(new rgn_3("resourcepack.requesting"));
         }

         try {
            try {
               byte[] var9 = new byte[4096];
               URL var26 = new URL(var1);
               var6 = (HttpURLConnection)var26.openConnection(var5);
               var6.setInstanceFollowRedirects(true);
               float var11 = 0.0F;
               float var12 = (float)var2.entrySet().size();

               for (Entry var14 : var2.entrySet()) {
                  var6.setRequestProperty((String)var14.getKey(), (String)var14.getValue());
                  if (var4 != null) {
                     var4.break_((int)(++var11 / var12 * 100.0F));
                  }
               }

               var7 = var6.getInputStream();
               var12 = (float)var6.getContentLength();
               int var28 = var6.getContentLength();
               if (var4 != null) {
                  var4.protected_(new rgn_3("resourcepack.progress", String.format(Locale.ROOT, "%.2f", var12 / 1000.0F / 1000.0F)));
               }

               if (var0.exists()) {
                  long var29 = var0.length();
                  if (var29 == (long)var28) {
                     if (var4 != null) {
                        var4.finally_();
                     }

                     return null;
                  }

                  break_.warn("Deleting {} as it does not match what we currently have ({} vs our {}).", var0, var28, var29);
                  FileUtils.deleteQuietly(var0);
               } else if (var0.getParentFile() != null) {
                  var0.getParentFile().mkdirs();
               }

               var8 = new DataOutputStream(new FileOutputStream(var0));
               if (var3 > 0 && var12 > (float)var3) {
                  if (var4 != null) {
                     var4.finally_();
                  }

                  throw new IOException("Filesize is bigger than maximum allowed (file is " + var11 + ", limit is " + var3 + ")");
               }

               int var30;
               while ((var30 = var7.read(var9)) >= 0) {
                  var11 += (float)var30;
                  if (var4 != null) {
                     var4.break_((int)(var11 / var12 * 100.0F));
                  }

                  if (var3 > 0 && var11 > (float)var3) {
                     if (var4 != null) {
                        var4.finally_();
                     }

                     throw new IOException("Filesize was bigger than maximum allowed (got >= " + var11 + ", limit was " + var3 + ")");
                  }

                  if (Thread.interrupted()) {
                     break_.error("INTERRUPTED");
                     if (var4 != null) {
                        var4.finally_();
                     }

                     return null;
                  }

                  var8.write(var9, 0, var30);
               }

               if (var4 != null) {
                  var4.finally_();
                  return null;
               }
            } catch (Throwable var22) {
               var22.printStackTrace();
               if (var6 != null) {
                  InputStream var10 = var6.getErrorStream();

                  try {
                     break_.error(IOUtils.toString(var10));
                  } catch (IOException var21) {
                     var21.printStackTrace();
                  }
               }

               if (var4 != null) {
                  var4.finally_();
                  return null;
               }
            }

            return null;
         } finally {
            IOUtils.closeQuietly(var7);
            IOUtils.closeQuietly(var8);
         }
      }, class_);
   }

   public static int class_() {
      try {
         int var1;
         try (ServerSocket var0 = new ServerSocket(0)) {
            var1 = var0.getLocalPort();
         }

         return var1;
      } catch (IOException var5) {
         return 25564;
      }
   }
}
