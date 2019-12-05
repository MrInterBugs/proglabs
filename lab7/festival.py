class Act:
    def __init__(self, num_members, name, kind, stage):
        self.num_members = num_members
        self.name = name
        self.kind = kind
        self.stage = stage

    def __str__(self):
        return ("The preforming act is called: " + self.name + " they are a " + self.kind + " There will be " + str(self.num_members) + " member/members on the stage and this will be preformed at " + str(self.stage))

    def get_num_members(self):
        return self.num_members
    def get_name(self):
        return self.name
    def get_kind(self):
        return self.kind
    def get_stage(self):
        return self.stage

    def set_num_members(self, x):
        self.num_members = x
    def set_name(self, x):
        self.name = x
    def set_kind(self, x):
        self.kind = x
    def set_stage(self, x):
        self.stage = x

x = 0

class LineUp:
    def __init__(self):
       self._acts = []

    def add_act(self, myact):
        global x
        if x < 30:
            self._acts.append(Act(myact.num_members, myact.name, myact.kind, myact.stage))
            x += 1
        else:
            print("The festival is full!")

    def __str__(self):
        i = 0
        while i < len(self._acts):
            print(self._acts[i].name + " is a " + self._acts[i].kind + " There will be " + str(self._acts[i].num_members) + " member/members on the stage and this will be preformed at "  + str(self._acts[i].stage) + "\n")
            i = i + 1
        return "Finsished"
    def prints(self):
        i = 0
        while i < len(self._acts):
            print(self._acts[i].name + " is a " + self._acts[i].kind + " There will be " + str(self._acts[i].num_members) + " member/members on the stage and this will be preformed at "  + str(self._acts[i].stage) + "\n")
            i = i + 1
        return "Finsished"
    
    def numberOfActs(self):
        print(len(self._acts))
        
    def totalMembers(self):
        i = 0
        count = 0
        while i < len(self._acts):
            count = count + self._acts[i].num_members
            i += 1
        print(str(count))

    def totalKinds(self):
        list = []
        i = 0
        count = 0
        while i < len(self._acts):
            kind = self._acts[i].kind
            if kind in list:
                i += 1
            else:
                list.append(kind)
                count += 1
        print(str(count))
