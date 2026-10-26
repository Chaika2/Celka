package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.Logger;

public class rrQf_1 {
   public static Object[] class_;
   private static String[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      byte_ = new byte[]{2, 2, 2, 32, 2, 32, 2, 32, 2, 32, 8, 2, 2, 32, 2, 2};
   }

   public static CompletableFuture<Map<String, String>> byte_(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.break_[1]).info("Exchanging Xbox Live token for an Xbox Live XSTS token...");

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               Map var5;
               try {
                  HttpPost var2 = new HttpPost(URI.create(break_[35]));
                  var2.setConfig((RequestConfig)class_[protected_[15]]);
                  var2.setHeader(break_[36], break_[37]);
                  String var10003 = break_[38];
                  Object[] var10004 = new Object[throws_[10]];
                  var10004[throws_[11]] = var0;
                  var2.setEntity(new StringEntity(String.format(var10003, var10004)));
                  ((Logger)QY.break_[protected_[16]])
                     .info(break_[39], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / protected_[17]);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = var3.getStatusLine().getStatusCode() == protected_[18]
                     ? new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject()
                     : new JsonObject();
                  var5 = Optional.ofNullable(var4.get(break_[40]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : throws_[16])
                     .map(var1xx -> {
                        String var2x = var4.get("DisplayClaims")
                           .getAsJsonObject()
                           .get("xui")
                           .getAsJsonArray()
                           .get(0)
                           .getAsJsonObject()
                           .get("uhs")
                           .getAsString();
                        ((Logger)QY.break_[1])
                           .info("Acquired Xbox Live XSTS token! (token={}, uhs={})", StringUtils.abbreviateMiddle(var1xx, "...", 32), var2x);
                        return Map.of("Token", var1xx, "uhs", var2x);
                     })
                     .orElseThrow(
                        () -> new Exception(
                              var4.has("XErr") ? String.format("%s: %s", var4.get("XErr").getAsString(), var4.get("Message").getAsString()) : break_[48]
                           )
                     );
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.break_[1]).warn("Xbox Live XSTS token acquisition was cancelled!");
               throw new CancellationException("Interrupted");
            } catch (Exception var9) {
               ((Logger)QY.break_[1]).error("Unable to acquire Xbox Live XSTS token!", var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private rrQf_1() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 929109448;
   }

   public static CompletableFuture<String> class_(Function<Boolean, String> var0, Executor var1, @Nullable rrQj_1 var2) {
      return class_(var0x -> rqR_2.implements_().class_(var0x), var0, var1, var2);
   }

   public static CompletableFuture<String> class_(String var0, String var1, Executor var2) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.break_[1]).info("Exchanging Xbox Live XSTS token for a Minecraft access token...");

            try {
               CloseableHttpClient var2x = HttpClients.createMinimal();

               String var6;
               try {
                  HttpPost var3 = new HttpPost(URI.create(break_[18]));
                  var3.setConfig((RequestConfig)class_[protected_[8]]);
                  var3.setHeader(break_[19], break_[20]);
                  String var10003 = break_[21];
                  Object[] var10004 = new Object[byte_[1]];
                  var10004[throws_[4]] = var1;
                  var10004[throws_[5]] = var0;
                  var3.setEntity(new StringEntity(String.format(var10003, var10004)));
                  ((Logger)QY.break_[protected_[9]])
                     .info(break_[22], var3.getMethod(), var3.getURI().toString(), var3.getConfig().getConnectTimeout() / protected_[10]);
                  CloseableHttpResponse var4 = var2x.execute(var3);
                  JsonObject var5 = new JsonParser().parse(EntityUtils.toString(var4.getEntity())).getAsJsonObject();
                  var6 = Optional.ofNullable(var5.get(break_[23]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : throws_[9])
                     .map(var0xx -> {
                        ((Logger)QY.break_[1]).info("Acquired Minecraft access token! ({})", StringUtils.abbreviateMiddle(var0xx, "...", 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(
                        () -> new Exception(
                              var5.has("error") ? String.format("%s: %s", var5.get("error").getAsString(), var5.get("errorMessage").getAsString()) : break_[31]
                           )
                     );
               } catch (Throwable var8) {
                  if (var2x != null) {
                     try {
                        var2x.close();
                     } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                     }
                  }

                  throw var8;
               }

               if (var2x != null) {
                  var2x.close();
               }

               return var6;
            } catch (InterruptedException var9) {
               ((Logger)QY.break_[1]).warn("Minecraft access token acquisition was cancelled!");
               throw new CancellationException("Interrupted");
            } catch (Exception var10) {
               ((Logger)QY.break_[1]).error("Unable to acquire Minecraft access token!", var10);
               throw new CompletionException(var10);
            }
         },
         var2
      );
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3481563486528196784L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{31, -104, -66, -41, 126, 61, 16, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static CompletableFuture<String> class_(Consumer<URI> var0, Function<Boolean, String> var1, Executor var2) {
      return class_(var0, var1, var2, null);
   }

   public static CompletableFuture<String> class_(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.break_[1]).info("Exchanging Microsoft access token for an Xbox Live access token...");

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               String var5;
               try {
                  HttpPost var2 = new HttpPost(URI.create(break_[57]));
                  var2.setConfig((RequestConfig)class_[protected_[23]]);
                  var2.setHeader(break_[58], break_[59]);
                  String var10003 = break_[60];
                  Object[] var10004 = new Object[throws_[17]];
                  var10004[throws_[18]] = var0;
                  var2.setEntity(new StringEntity(String.format(var10003, var10004)));
                  ((Logger)QY.break_[protected_[24]])
                     .info(break_[61], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / protected_[25]);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = var3.getStatusLine().getStatusCode() == protected_[26]
                     ? new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject()
                     : new JsonObject();
                  var5 = Optional.ofNullable(var4.get(break_[62]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : throws_[22])
                     .map(var0xx -> {
                        ((Logger)QY.break_[1]).info("Acquired Xbox Live access token! ({})", StringUtils.abbreviateMiddle(var0xx, "...", 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(
                        () -> new Exception(
                              var4.has("XErr") ? String.format("%s: %s", var4.get("XErr").getAsString(), var4.get("Message").getAsString()) : break_[70]
                           )
                     );
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.break_[1]).warn("Xbox Live access token acquisition was cancelled!");
               throw new CancellationException("Interrupted");
            } catch (Exception var9) {
               ((Logger)QY.break_[1]).error("Unable to acquire Xbox Live access token!", var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private static void class_() {
      protected_ = new short[]{
         1,
         0,
         1,
         1000,
         1,
         1,
         1,
         1,
         0,
         1,
         1000,
         1,
         1,
         1,
         1,
         0,
         1,
         1000,
         200,
         1,
         1,
         1,
         1,
         0,
         1,
         1000,
         200,
         1,
         1,
         1,
         1,
         0,
         25585,
         1,
         1000,
         1,
         1,
         1,
         1,
         25585,
         1,
         1,
         1,
         1,
         1,
         200,
         30000,
         30000,
         30000
      };
   }

   public static CompletableFuture<String> class_(Function<Boolean, String> var0, Executor var1) {
      return class_(var0x -> rqR_2.implements_().class_(var0x), var0, var1);
   }

   public static CompletableFuture<String> class_(Consumer<URI> var0, Function<Boolean, String> var1, Executor var2, @Nullable rrQj_1 var3) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.break_[1]).info("Acquiring Microsoft auth code...");

            try {
               String var3x = RandomStringUtils.randomAlphanumeric(byte_[10]);
               HttpServer var4 = HttpServer.create(new InetSocketAddress(protected_[39]), throws_[29]);
               CountDownLatch var5 = new CountDownLatch(throws_[30]);
               AtomicReference var6 = new AtomicReference(null);
               AtomicReference var7 = new AtomicReference(null);
               var4.createContext(
                  break_[98],
                  var5x -> {
                     Map var6x = URLEncodedUtils.parse(var5x.getRequestURI(), "UTF-8")
                        .stream()
                        .collect(Collectors.toMap(NameValuePair::getName, NameValuePair::getValue));
                     if (!var3x.equals(var6x.get("state"))) {
                        var7.set(String.format("State mismatch! Expected '%s' but got '%s'.", var3x, var6x.get("state")));
                     } else if (var6x.containsKey("code")) {
                        var6.set((String)var6x.get("code"));
                     } else if (var6x.containsKey("error")) {
                        var7.set(String.format("%s: %s", var6x.get("error"), var6x.get("error_description")));
                     }

                     byte[] var7x = ((String)var1.apply(var7.get() == null ? true : throws_[40])).getBytes();
                     var5x.sendResponseHeaders(200, (long)var7x.length);
                     OutputStream var8x = var5x.getResponseBody();
                     var8x.write(var7x);
                     var8x.close();
                     var5.countDown();
                  }
               );
               URIBuilder var10000 = new URIBuilder(break_[99]).addParameter(break_[100], break_[101]).addParameter(break_[102], break_[103]);
               String var10001 = break_[104];
               String var10002 = break_[105];
               Object[] var10003 = new Object[throws_[31]];
               var10003[throws_[32]] = var4.getAddress().getPort();
               URIBuilder var8 = var10000.addParameter(var10001, String.format(var10002, var10003))
                  .addParameter(break_[106], break_[107])
                  .addParameter(break_[108], var3x);
               if (var3 != null) {
                  var8.addParameter(break_[109], var3.toString());
               }

               URI var9 = var8.build();
               ((Logger)QY.break_[protected_[40]]).info(break_[110], var9.toString());
               var0.accept(var9);
               boolean var15 = false /* VF: Semaphore variable */;

               String var10;
               try {
                  var15 = true;
                  ((Logger)QY.break_[protected_[41]]).info(break_[111], var4.getAddress().getPort());
                  var4.start();
                  var5.await();
                  var10 = Optional.ofNullable((String)var6.get())
                     .filter(var0xx -> !var0xx.isBlank() ? true : throws_[34])
                     .map(var0xx -> {
                        ((Logger)QY.break_[1]).info("Acquired Microsoft auth code! ({})", StringUtils.abbreviateMiddle((String)var0xx, "...", 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(
                        () -> new Exception((String)Optional.ofNullable((String)var7.get()).orElse("There was no auth code or error description present."))
                     );
                  var15 = false;
               } finally {
                  if (var15) {
                     var4.stop(byte_[12]);
                  }
               }

               var4.stop(byte_[11]);
               return var10;
            } catch (InterruptedException var17) {
               ((Logger)QY.break_[1]).warn("Microsoft auth code acquisition was cancelled!");
               throw new CancellationException("Interrupted");
            } catch (Exception var18) {
               ((Logger)QY.break_[1]).error("Unable to acquire Microsoft auth code!", var18);
               throw new CompletionException(var18);
            }
         },
         var2
      );
   }

   public static CompletableFuture<rqN_2> break_(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.break_[1]).info("Fetching Minecraft profile...");

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               rqN_2 var5;
               try {
                  HttpGet var2 = new HttpGet(URI.create(break_[2]));
                  var2.setConfig((RequestConfig)class_[protected_[1]]);
                  var2.setHeader(break_[3], "Bearer " + var0);
                  ((Logger)QY.break_[protected_[2]])
                     .info(break_[4], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / protected_[3]);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject();
                  var5 = Optional.ofNullable(var4.get(break_[5]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : throws_[3])
                     .map(var2x -> {
                        ((Logger)QY.break_[1]).info("Fetched Minecraft profile! (name={}, uuid={})", var4.get("name").getAsString(), var2x);
                        return new rqN_2(var4.get("name").getAsString(), var2x, var0, rqc_3.MOJANG.name());
                     })
                     .orElseThrow(
                        () -> new Exception(
                              var4.has("error") ? String.format("%s: %s", var4.get("error").getAsString(), var4.get("errorMessage").getAsString()) : break_[13]
                           )
                     );
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.break_[1]).warn("Minecraft profile fetching was cancelled!");
               throw new CancellationException("Interrupted");
            } catch (Exception var9) {
               ((Logger)QY.break_[1]).error("Unable to fetch Minecraft profile!", var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private static void break_() {
      throws_ = new boolean[]{
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true
      };
   }

   private static void throws_() {
      Object[] var0 = new Object[]{RequestConfig.custom().setConnectionRequestTimeout(30000).setConnectTimeout(30000).setSocketTimeout(30000).build()};
      class_ = var0;
   }

   public static CompletableFuture<String> protected_(String var0, Executor var1) {
      return CompletableFuture.supplyAsync(
         () -> {
            ((Logger)QY.break_[1]).info("Exchanging Microsoft auth code for an access token...");

            try {
               CloseableHttpClient var1x = HttpClients.createMinimal();

               String var5;
               try {
                  HttpPost var2 = new HttpPost(URI.create(break_[74]));
                  var2.setConfig((RequestConfig)class_[protected_[31]]);
                  var2.setHeader(break_[75], break_[76]);
                  BasicNameValuePair var10003 = new BasicNameValuePair(break_[77], break_[78]);
                  BasicNameValuePair var10004 = new BasicNameValuePair(break_[79], break_[80]);
                  BasicNameValuePair var10005 = new BasicNameValuePair(break_[81], var0);
                  String var10008 = break_[82];
                  String var10009 = break_[83];
                  Object[] var10010 = new Object[throws_[23]];
                  var10010[throws_[24]] = Integer.valueOf(protected_[32]);
                  var2.setEntity(
                     new UrlEncodedFormEntity(
                        List.of(var10003, var10004, var10005, new BasicNameValuePair(var10008, String.format(var10009, var10010))), break_[84]
                     )
                  );
                  ((Logger)QY.break_[protected_[33]])
                     .info(break_[85], var2.getMethod(), var2.getURI().toString(), var2.getConfig().getConnectTimeout() / protected_[34]);
                  CloseableHttpResponse var3 = var1x.execute(var2);
                  JsonObject var4 = new JsonParser().parse(EntityUtils.toString(var3.getEntity())).getAsJsonObject();
                  var5 = Optional.ofNullable(var4.get(break_[86]))
                     .<String>map(JsonElement::getAsString)
                     .filter(var0xx -> !var0xx.isBlank() ? true : throws_[28])
                     .map(var0xx -> {
                        ((Logger)QY.break_[1]).info("Acquired Microsoft access token! ({})", StringUtils.abbreviateMiddle(var0xx, "...", 32));
                        return (String)var0xx;
                     })
                     .orElseThrow(
                        () -> new Exception(
                              var4.has("error")
                                 ? String.format("%s: %s", var4.get("error").getAsString(), var4.get("error_description").getAsString())
                                 : break_[94]
                           )
                     );
               } catch (Throwable var7) {
                  if (var1x != null) {
                     try {
                        var1x.close();
                     } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                     }
                  }

                  throw var7;
               }

               if (var1x != null) {
                  var1x.close();
               }

               return var5;
            } catch (InterruptedException var8) {
               ((Logger)QY.break_[1]).warn("Microsoft access token acquisition was cancelled!");
               throw new CancellationException("Interrupted");
            } catch (Exception var9) {
               ((Logger)QY.break_[1]).error("Unable to acquire Microsoft access token!", var9);
               throw new CompletionException(var9);
            }
         },
         var1
      );
   }

   private static void protected_() {
      break_ = new String[]{
         new String("This is a utility class and cannot be instantiated"),
         new String("Fetching Minecraft profile..."),
         new String("https://api.minecraftservices.com/minecraft/profile"),
         new String("Authorization"),
         new String("[{}] {} (timeout={}s)"),
         new String("id"),
         new String("Minecraft profile fetching was cancelled!"),
         new String("Interrupted"),
         new String("Unable to fetch Minecraft profile!"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("errorMessage"),
         new String("There was no profile or error description present."),
         new String("Fetched Minecraft profile! (name={}, uuid={})"),
         new String("name"),
         new String("name"),
         new String("Exchanging Xbox Live XSTS token for a Minecraft access token..."),
         new String("https://api.minecraftservices.com/authentication/login_with_xbox"),
         new String("Content-Type"),
         new String("application/json"),
         new String("{\"identityToken\": \"XBL3.0 x=%s;%s\"}"),
         new String("[{}] {} (timeout={}s)"),
         new String("access_token"),
         new String("Minecraft access token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Minecraft access token!"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("errorMessage"),
         new String("There was no access token or error description present."),
         new String("Acquired Minecraft access token! ({})"),
         new String("..."),
         new String("Exchanging Xbox Live token for an Xbox Live XSTS token..."),
         new String("https://xsts.auth.xboxlive.com/xsts/authorize"),
         new String("Content-Type"),
         new String("application/json"),
         new String(
            "{\n  \"Properties\": {\n    \"SandboxId\": \"RETAIL\",\n    \"UserTokens\": [\"%s\"]\n  },\n  \"RelyingParty\": \"rp://api.minecraftservices.com/\",\n  \"TokenType\": \"JWT\"\n}"
         ),
         new String("[{}] {} (timeout={}s)"),
         new String("Token"),
         new String("Xbox Live XSTS token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Xbox Live XSTS token!"),
         new String("XErr"),
         new String("%s: %s"),
         new String("XErr"),
         new String("Message"),
         new String("There was no access token or error description present."),
         new String("DisplayClaims"),
         new String("xui"),
         new String("uhs"),
         new String("Acquired Xbox Live XSTS token! (token={}, uhs={})"),
         new String("..."),
         new String("Token"),
         new String("uhs"),
         new String("Exchanging Microsoft access token for an Xbox Live access token..."),
         new String("https://user.auth.xboxlive.com/user/authenticate"),
         new String("Content-Type"),
         new String("application/json"),
         new String(
            "{\n  \"Properties\": {\n    \"AuthMethod\": \"RPS\",\n    \"SiteName\": \"user.auth.xboxlive.com\",\n    \"RpsTicket\": \"d=%s\"\n  },\n  \"RelyingParty\": \"http://auth.xboxlive.com\",\n  \"TokenType\": \"JWT\"\n}"
         ),
         new String("[{}] {} (timeout={}s)"),
         new String("Token"),
         new String("Xbox Live access token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Xbox Live access token!"),
         new String("XErr"),
         new String("%s: %s"),
         new String("XErr"),
         new String("Message"),
         new String("There was no access token or error description present."),
         new String("Acquired Xbox Live access token! ({})"),
         new String("..."),
         new String("Exchanging Microsoft auth code for an access token..."),
         new String("https://login.microsoftonline.com/consumers/oauth2/v2.0/token"),
         new String("Content-Type"),
         new String("application/x-www-form-urlencoded"),
         new String("client_id"),
         new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"),
         new String("grant_type"),
         new String("authorization_code"),
         new String("code"),
         new String("redirect_uri"),
         new String("http://localhost:%d/callback"),
         new String("UTF-8"),
         new String("[{}] {} (timeout={}s)"),
         new String("access_token"),
         new String("Microsoft access token acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Microsoft access token!"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("error_description"),
         new String("There was no access token or error description present."),
         new String("Acquired Microsoft access token! ({})"),
         new String("..."),
         new String("Acquiring Microsoft auth code..."),
         new String("/callback"),
         new String("https://login.microsoftonline.com/consumers/oauth2/v2.0/authorize"),
         new String("client_id"),
         new String("e16699bb-2aa8-46da-b5e3-45cbcce29091"),
         new String("response_type"),
         new String("code"),
         new String("redirect_uri"),
         new String("http://localhost:%d/callback"),
         new String("scope"),
         new String("XboxLive.signin offline_access"),
         new String("state"),
         new String("prompt"),
         new String("Launching Microsoft login in browser: {}"),
         new String("Begin listening on http://localhost:{}/callback for a successful Microsoft login..."),
         new String("Microsoft auth code acquisition was cancelled!"),
         new String("Interrupted"),
         new String("Unable to acquire Microsoft auth code!"),
         new String("There was no auth code or error description present."),
         new String("Acquired Microsoft auth code! ({})"),
         new String("..."),
         new String("UTF-8"),
         new String("state"),
         new String("State mismatch! Expected '%s' but got '%s'."),
         new String("state"),
         new String("code"),
         new String("code"),
         new String("error"),
         new String("%s: %s"),
         new String("error"),
         new String("error_description")
      };
   }
}
