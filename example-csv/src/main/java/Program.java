/**
 * @author wangpengfei
 * @date 2019/12/9
 */
public class Program {
    // translate the csv file to events, for test purpose
    // (<length><event)+*
//    public static void main(String[] args) throws IOException {
//        try (BufferedReader reader = new BufferedReader(
//                new FileReader("/Users/wangpengfei/go/src/code.aliyun.com/yunli-bigdata/base/event-bus/examples" +
//                        "/runtime-example/Financial Sample.csv"));
//             DataOutputStream output = new DataOutputStream(
//                     new FileOutputStream("/Users/wangpengfei/go/src/code.aliyun.com/yunli-bigdata/base/event-bus/examples" +
//                             "/runtime-example/data.dat"))
//        ) {
//            String line = reader.readLine(); // skip the title line
//            line = reader.readLine();
//            int count = 0;
//            StringBuilder sb = new StringBuilder();
//            while (line != null) {
//                sb.append(line);
//                count++;
//                if (count % 10 == 0) {
//                    writeResult(output, sb);
//                    sb = new StringBuilder();
//                } else {
//                    sb.append("\n");
//                }
//                line = reader.readLine();
//            }
//
//            if (sb.length() > 0) {
//                writeResult(output, sb);
//            }
//        }
//    }
//
//    private static void writeResult(DataOutputStream output, StringBuilder sb) throws IOException {
//        Common.Event event = Common.Event.newBuilder()
//                .setTopic("mytopic")
//                .setPartitionKey("mykey")
//                .setData(ByteString.copyFromUtf8(sb.toString()))
//                .build();
//        output.writeInt(event.getSerializedSize());
//        event.writeTo(output);
//        output.flush();
//    }
}
