package academy.prog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonMessages {
    private final List<Message> list = new ArrayList<>();
    private final Map<String, String> users = new HashMap();

    public JsonMessages(List<Message> sourceList, int fromIndex) {
        for (int i = fromIndex; i < sourceList.size(); i++)
            list.add(sourceList.get(i));
    }





}
